package pl.michalsznajder.browsemycarsspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import pl.michalsznajder.browsemycarsspring.models.Mark;
import pl.michalsznajder.browsemycarsspring.repositories.IMarkRepository;


@Service
public class MarkService implements IMarkService{
    @Autowired
    private IMarkRepository iMarkRepository;

    @Override
    public Mark getMark(Long id) throws DataAccessException {
        return iMarkRepository.findById(id).orElse(null);
    }

    @Override
    public void createMark(Mark mark) throws DataAccessException {
        iMarkRepository.save(mark);
    }

    @Override
    public void updateMark(Mark mark) throws DataAccessException {
        iMarkRepository.save(mark);
    }

    @Override
    public void deleteMark(Long id) throws DataAccessException {
        iMarkRepository.deleteById(id);
    }

    @Override
    public Iterable<Mark> getAllMarks() throws DataAccessException {
        return iMarkRepository.findAll();
    }
}
