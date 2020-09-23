package pl.michalsznajder.browsemycarsspring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.michalsznajder.browsemycarsspring.models.Picture;

@Repository
public interface IPictureRepository extends CrudRepository<Picture, Long> {
}
