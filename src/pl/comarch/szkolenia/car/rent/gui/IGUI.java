package pl.comarch.szkolenia.car.rent.gui;

import pl.comarch.szkolenia.car.rent.model.Car;
import pl.comarch.szkolenia.car.rent.model.User;

import java.util.List;

public interface IGUI {
    String showMenu();
    void listCars(List<Car> cars);
    String getPlate();
    void showRentResult(boolean result);
    User readAuthData();
}
