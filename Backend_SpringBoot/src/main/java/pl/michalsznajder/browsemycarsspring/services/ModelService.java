package pl.michalsznajder.browsemycarsspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import pl.michalsznajder.browsemycarsspring.models.Model;
import pl.michalsznajder.browsemycarsspring.repositories.IModelRepository;

@Service
public class ModelService implements IModelService {
    @Autowired
    private IModelRepository iModelRepository;

    @Override
    public Model getModel(Long id) throws DataAccessException {
        return iModelRepository.findById(id).orElse(null);
    }

    @Override
    public void createModel(Model model) throws DataAccessException {
        iModelRepository.save(model);
    }

    @Override
    public void updateModel(Model model) throws DataAccessException {
        iModelRepository.save(model);
    }

    @Override
    public void deleteModel(Long id) throws DataAccessException {
        iModelRepository.deleteById(id);
    }

    @Override
    public Iterable<Model> getAllModels() throws DataAccessException {
        return iModelRepository.findAll();
    }
}
