package pl.comarch.szkolenia.car.rent.gui;

import pl.comarch.szkolenia.car.rent.model.Car;
import pl.comarch.szkolenia.car.rent.model.User;

import java.util.List;

public class GUI2 implements IGUI {
    private static GUI2 instance;

    private GUI2() {}
    @Override
    public String showMenu() {
        return null;
    }

    @Override
    public void listCars(List<Car> cars) {

    }

    @Override
    public String getPlate() {
        return null;
    }

    @Override
    public void showRentResult(boolean result) {

    }

    @Override
    public User readAuthData() {
        return null;
    }

    public static GUI2 getInstance() {
        if(instance == null) {
            instance = new GUI2();
        }
        return instance;
    }
}
