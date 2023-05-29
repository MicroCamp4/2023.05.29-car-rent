package pl.comarch.szkolenia.car.rent.auth;

import org.apache.commons.codec.digest.DigestUtils;
import pl.comarch.szkolenia.car.rent.database.UserRepository;
import pl.comarch.szkolenia.car.rent.model.User;

import java.util.Optional;

public class Authenticator {
    UserRepository userRepository = UserRepository.getInstance();
    private static Authenticator instance;

    private final String seed = "D4@af!CvYAFx*927Mk*uZ0gC1%fgREqF";
    private Authenticator() {
    }

    public boolean authenticate(String login, String password) {
        Optional<User> userBox = userRepository.getUserByLogin(login);
        return userBox.isPresent() &&
                userBox.get().getPassword().equals(DigestUtils.md5Hex(password + this.seed));
    }

    public static Authenticator getInstance() {
        if(instance == null) {
            instance = new Authenticator();
        }
        return instance;
    }
}
