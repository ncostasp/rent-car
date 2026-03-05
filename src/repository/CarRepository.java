package repository;

import model.Car;
import model.Model;

import java.util.ArrayList;

public class CarRepository implements ICarRepository {

    // Singleton

    private ArrayList<Car> cars;
    private static CarRepository carRepository;

    private CarRepository() {
        cars = new ArrayList<>();
        addInitialCars();
    }

    public static CarRepository getCarRepository() {
        if(carRepository == null){
            carRepository = new CarRepository();
        }
        return carRepository;
    }

    //

    public void add(Car car){
        car.setId(nextIdAvailable());
        cars.add(car);
    }

    public void update(Car car){
        cars.set(cars.indexOf(findById(car.getId())), car); // Sustituye el que ya había por este en la bbdd
    }

    public ArrayList findAll(){
        return cars;
    }

    public void deleteById(Long id){
        for (Car car : cars) {
            if (car.getId() == id) {
                cars.remove(car);
                break;
            }
        }
    }

    public Long nextIdAvailable(){
        if(!cars.isEmpty()){
            return cars.get(cars.size()-1).getId() + 1;
        }
        else{
            return (long)1;
        }
    }

    public Car findById(Long id) {
        for (Car car : cars) {
            if(car.getId() == id){
                return car;
            }
        }
        return null;
    }

    public Car findByLicensePlate(String licensePlate){
        for (Car car : cars) {
            if(car.getLicensePlate().equals(licensePlate)){
                return car;
            }
        }
        return null;
    }

    public void cleanUp(){
        cars = new ArrayList<>();
    }

    public void addInitialCars(){
        Model model = new Model("Toyota", 30);
        add(new Car(1, "87896685P", model));
    }






}
