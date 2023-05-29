package pl.comarch.szkolenia.car.rent.core;

import pl.comarch.szkolenia.car.rent.auth.Authenticator;
import pl.comarch.szkolenia.car.rent.database.CarRepository;
import pl.comarch.szkolenia.car.rent.database.UserRepository;
import pl.comarch.szkolenia.car.rent.gui.GUI;
import pl.comarch.szkolenia.car.rent.gui.GUI2;
import pl.comarch.szkolenia.car.rent.gui.IGUI;
import pl.comarch.szkolenia.car.rent.model.User;

public class Core {
    IGUI gui = GUI.getInstance();
    CarRepository carRepository = CarRepository.getInstance();
    Authenticator authenticator = Authenticator.getInstance();

    private static Core instance;

    private Core() {}
    public void start() {
        String choose = "3";
        for(int i = 0; i < 3; i++) {
            User user = this.gui.readAuthData();
            boolean authResult = this.authenticator.authenticate(user.getLogin(),
                    user.getPassword());
            if(authResult) {
                choose = "";
                break;
            }
        }
        while(!"3".equals(choose)) {
            switch (choose = this.gui.showMenu()) {
                case "1":
                    this.gui.listCars(this.carRepository.getCars());
                    break;
                case "2":
                    this.gui.showRentResult(this.carRepository.rentCar(this.gui.getPlate()));
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Wrong choose !!!");
                    break;
            }
        }
    }

    public static Core getInstance() {
        if(instance == null) {
            instance = new Core();
        }
        return instance;
    }
}
