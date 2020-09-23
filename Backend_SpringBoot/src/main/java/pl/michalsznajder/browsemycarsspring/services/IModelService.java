package pl.michalsznajder.browsemycarsspring.services;

import org.springframework.dao.DataAccessException;
import pl.michalsznajder.browsemycarsspring.models.Model;

public interface IModelService {
    Model getModel(Long id) throws DataAccessException;
    void createModel(Model model) throws DataAccessException;
    void updateModel(Model model) throws DataAccessException;
    void deleteModel(Long id)throws DataAccessException;
    Iterable<Model> getAllModels() throws DataAccessException;
}
