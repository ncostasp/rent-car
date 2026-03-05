package service;

import model.Car;
import model.Client;

import java.util.ArrayList;

public interface ICarService {

    Client findByLicensePlate(String licensePlate);
    ArrayList findAll();
    void add(Car car);
    void deleteById(Long id);
    void update(Car car);

}
