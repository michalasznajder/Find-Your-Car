package pl.michalsznajder.browsemycarsspring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.michalsznajder.browsemycarsspring.models.Car;

@Repository
public interface ICarRepository extends CrudRepository<Car, Long> {


}
