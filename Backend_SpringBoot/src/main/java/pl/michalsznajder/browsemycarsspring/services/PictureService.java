package pl.michalsznajder.browsemycarsspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import pl.michalsznajder.browsemycarsspring.models.Picture;
import pl.michalsznajder.browsemycarsspring.repositories.IPictureRepository;

@Service
public class PictureService implements IPictureService{
    @Autowired
    private IPictureRepository iPictureRepository;

    @Override
    public Picture getPicture(Long id) throws DataAccessException {
        return iPictureRepository.findById(id).orElse(null);
    }

    @Override
    public void createPicture(Picture picture) throws DataAccessException {
        iPictureRepository.save(picture);
    }

    @Override
    public void updatePicture(Picture picture) throws DataAccessException {
        iPictureRepository.save(picture);
    }

    @Override
    public void deletePicture(Long id) throws DataAccessException {
        iPictureRepository.deleteById(id);
    }

    @Override
    public Iterable<Picture> getAllPictures() throws DataAccessException {
        return iPictureRepository.findAll();
    }
}
