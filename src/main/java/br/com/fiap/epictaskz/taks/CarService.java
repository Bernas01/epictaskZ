package br.com.fiap.epictaskz.taks;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car save(Car car) {
        car.setId(UUID.randomUUID()); // Gera um novo ID
        return carRepository.save(car);
    }

    public void delete(UUID id) {
        carRepository.deleteById(id);
    }
}