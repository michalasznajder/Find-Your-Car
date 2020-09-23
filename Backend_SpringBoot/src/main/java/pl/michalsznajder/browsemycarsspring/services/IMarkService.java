package pl.michalsznajder.browsemycarsspring.services;

import org.springframework.dao.DataAccessException;
import pl.michalsznajder.browsemycarsspring.models.Mark;

public interface IMarkService {
    Mark getMark(Long id) throws  DataAccessException;
    void createMark(Mark mark) throws DataAccessException;
    void updateMark(Mark mark) throws DataAccessException;
    void deleteMark(Long id)throws DataAccessException;
    Iterable<Mark> getAllMarks() throws DataAccessException;
}
