package pl.comarch.szkolenia.car.rent.model;

public class Car {
    private String brand;
    private String model;
    private double price;
    private int year;
    private boolean rent;
    private String plate;

    public Car() {
    }

    public Car(String brand, String model, double price, int year, boolean rent, String plate) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.rent = rent;
        this.plate = plate;
    }

    public Car(String brand, String model, double price, int year, String plate) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.plate = plate;
        this.rent = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return new StringBuilder()
        .append(brand).append(" ")
        .append(model).append(" ")
        .append("Cena: ").append(price).append(" ")
        .append("Rok: ").append(year).append(" ")
        .append("Rejestracja: ").append(plate).append(" ")
        .append(this.rent ? "Niedostepny" : "Dostepny").toString();
    }
}
