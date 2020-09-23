package pl.michalsznajder.browsemycarsspring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.michalsznajder.browsemycarsspring.models.Model;

@Repository
public interface IModelRepository extends CrudRepository<Model, Long> {

}
