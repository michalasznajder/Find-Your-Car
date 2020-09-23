package pl.michalsznajder.browsemycarsspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.michalsznajder.browsemycarsspring.models.Mark;
import pl.michalsznajder.browsemycarsspring.services.IMarkService;


@RestController
@CrossOrigin(origins = {"https://findyourcar.azurewebsites.net", "http://localhost:4200"})
@RequestMapping("/mark")
public class MarkController {

    @Autowired
    private IMarkService iMarkService;


    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getMark(@PathVariable Long id){
        Mark mark;
        try {
            mark = iMarkService.getMark(id);
            System.out.println(mark);
        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(mark, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createMark(@RequestBody Mark mark){
        try{
            iMarkService.createMark(mark);
        }catch (DataAccessException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);

        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<Object> updateMark(@RequestBody Mark mark){
        try{
            iMarkService.updateMark(mark);
        }catch (DataAccessException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);

        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteMark(@PathVariable Long id){
        try {
            iMarkService.deleteMark(id);
        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<Object> getAllMarks(){
        Iterable<Mark> marks;
        try {
            marks = iMarkService.getAllMarks();
        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(marks, HttpStatus.OK);
    }





}
