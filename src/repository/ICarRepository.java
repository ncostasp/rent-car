package repository;

import model.Car;
import model.Client;

import java.util.ArrayList;

public interface ICarRepository {
    Car findByLicensePlate(String licensePlate);
    void add(Car car);
    void deleteById(Long id);
    ArrayList findAll();
    Car findById(Long id);
    void update(Car car);
}
