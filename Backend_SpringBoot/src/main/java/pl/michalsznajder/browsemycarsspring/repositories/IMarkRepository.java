package pl.michalsznajder.browsemycarsspring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.michalsznajder.browsemycarsspring.models.Mark;

@Repository
public interface IMarkRepository extends CrudRepository<Mark, Long> {

}


