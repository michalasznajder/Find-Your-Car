package pl.michalsznajder.browsemycarsspring.services;

import org.springframework.dao.DataAccessException;
import pl.michalsznajder.browsemycarsspring.models.Picture;

public interface IPictureService {
    Picture getPicture(Long id) throws DataAccessException;
    void createPicture(Picture mark) throws DataAccessException;
    void updatePicture(Picture mark) throws DataAccessException;
    void deletePicture(Long id)throws DataAccessException;
    Iterable<Picture> getAllPictures() throws DataAccessException;
}
