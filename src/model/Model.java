package model;

import java.util.ArrayList;

public class Model {
    private String name;
    private int pricePerDay;
    private ArrayList<Car> cars;


    public Model(String name, int pricePerDay) {
        this.name = name;
        this.pricePerDay = pricePerDay;
        this.cars = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }
}
