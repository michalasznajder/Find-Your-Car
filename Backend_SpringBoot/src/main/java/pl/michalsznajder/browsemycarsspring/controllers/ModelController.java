package pl.michalsznajder.browsemycarsspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.michalsznajder.browsemycarsspring.models.Mark;
import pl.michalsznajder.browsemycarsspring.models.Model;
import pl.michalsznajder.browsemycarsspring.services.IModelService;

import javax.annotation.PostConstruct;

@RestController
@CrossOrigin(origins = {"https://findyourcar.azurewebsites.net", "http://localhost:4200"})
@RequestMapping("/model")
public class ModelController {
    @Autowired
    private IModelService iModelService;


    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getMark(@PathVariable Long id){
        Model model;
        try {
            model = iModelService.getModel(id);
        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(model, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createMark(@RequestBody Model model){
        try{
            iModelService.createModel(model);
        }catch (DataAccessException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);

        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Object> updateMark(@RequestBody Model model){
        try{
            iModelService.updateModel(model);
        }catch (DataAccessException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);

        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteMark(@PathVariable Long id){
        try {
            iModelService.deleteModel(id);
        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/get/all")
    public ResponseEntity<Object> getAllMarks(){
        Iterable<Model> models;
        try {
            models = iModelService.getAllModels();
        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(models, HttpStatus.OK);
    }

}
