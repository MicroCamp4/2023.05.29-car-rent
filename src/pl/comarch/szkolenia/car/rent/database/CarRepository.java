package pl.comarch.szkolenia.car.rent.database;

import pl.comarch.szkolenia.car.rent.model.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRepository {
    private final Map<String, Car> cars = new HashMap<>();

    private static CarRepository instance;

    private CarRepository() {
        this.cars.put("KR11", new Car("BMW", "3", 250.00, 2010, "KR11"));
        this.cars.put("KR22", new Car("Audi", "A5", 300.00, 2012, "KR22"));
        this.cars.put("KR33", new Car("Kia", "Ceed", 200.00, 2013, "KR33"));
        this.cars.put("KR44", new Car("Toyota", "Corolla", 440.00, 2019, "KR44"));
        this.cars.put("KR55", new Car("Honda", "Civic", 400.00, 2018, "KR55"));
    }

    public boolean rentCar(String plate) {
        Car car = this.cars.get(plate);
        if(car == null || car.isRent()) {
            return false;
        }
        car.setRent(true);
        return true;
    }

    public List<Car> getCars() {
        return new ArrayList<>(this.cars.values());
    }

    public static CarRepository getInstance() {
        if(instance == null) {
            instance = new CarRepository();
        }
        return instance;
    }
}
