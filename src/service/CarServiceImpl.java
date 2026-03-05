package service;

import model.Car;
import model.Client;
import repository.CarRepository;
import repository.ICarRepository;

import java.util.ArrayList;

public class CarServiceImpl implements ICarService {

    private ICarRepository repository;
    public CarServiceImpl() {
        repository = CarRepository.getCarRepository();
    }

    public void add(Car car) {
        repository.add(car);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public ArrayList findAll() {
        return repository.findAll();
    }


    public Client findByDni(String dni) {
        return repository.findByDni(dni);
    }


    public void update(Client client) {
        repository.update(client);
    }

}
