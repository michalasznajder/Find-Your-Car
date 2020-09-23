package pl.michalsznajder.browsemycarsspring.services;

import org.springframework.dao.DataAccessException;
import pl.michalsznajder.browsemycarsspring.models.Car;

public interface ICarService {
    Car getCar(Long id) throws DataAccessException;
    void createCar(Car car) throws DataAccessException;
    void updateCar(Car car) throws DataAccessException;
    void deleteCar(Long id)throws DataAccessException;
    Iterable<Car> getAllCars() throws DataAccessException;
}
