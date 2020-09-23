package pl.michalsznajder.browsemycarsspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import pl.michalsznajder.browsemycarsspring.models.Car;
import pl.michalsznajder.browsemycarsspring.repositories.ICarRepository;

@Service
public class CarService implements ICarService{
    @Autowired
    private ICarRepository iCarRepository;

    @Override
    public Car getCar(Long id) throws DataAccessException {
        return iCarRepository.findById(id).orElse(null);
    }

    @Override
    public void createCar(Car car) throws DataAccessException {
        iCarRepository.save(car);
    }

    @Override
    public void updateCar(Car car) throws DataAccessException {
        iCarRepository.save(car);
    }

    @Override
    public void deleteCar(Long id) throws DataAccessException {
        iCarRepository.deleteById(id);
    }

    @Override
    public Iterable<Car> getAllCars() throws DataAccessException {
        return iCarRepository.findAll();
    }
}
