package pl.comarch.szkolenia.car.rent.database;

import pl.comarch.szkolenia.car.rent.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository {
    private final Map<String, User> users = new HashMap<>();

    private static UserRepository instance;
    private UserRepository() {
        this.users.put("admin",
                new User("admin", "0441880c178f0e4b0239c6bb3fe40412"));
        this.users.put("janusz",
                new User("janusz", "7413b5c0622006c3bb704c9c16d66110"));
    }

    public Optional<User> getUserByLogin(String login) {
        User user = this.users.get(login);
        if(user == null) {
            return Optional.empty();
        }
        return Optional.of(user);
    }

    public static UserRepository getInstance() {
        if(instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }
}
