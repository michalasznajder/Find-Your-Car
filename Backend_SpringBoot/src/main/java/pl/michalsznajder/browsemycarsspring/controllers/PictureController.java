package pl.michalsznajder.browsemycarsspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.michalsznajder.browsemycarsspring.models.Picture;
import pl.michalsznajder.browsemycarsspring.services.IPictureService;

@RestController
@CrossOrigin(origins = {"https://findyourcar.azurewebsites.net", "http://localhost:4200"})
@RequestMapping("/picture")
public class PictureController {
    @Autowired
    private IPictureService iPictureService;


    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getPicture(@PathVariable Long id){
        Picture picture;
        try {
            picture = iPictureService.getPicture(id);
            System.out.println(picture);
        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(picture, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createPicture(@RequestBody Picture picture){
        try{
            iPictureService.createPicture(picture);
        }catch (DataAccessException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);

        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @PutMapping("/update")
    public ResponseEntity<Object> updatePicture(@RequestBody Picture picture){
        try{
            iPictureService.updatePicture(picture);
        }catch (DataAccessException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);

        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deletePicture(@PathVariable Long id){
        try {
            iPictureService.deletePicture(id);
        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<Object> getAllPictures(){
        Iterable<Picture> pictures;
        try {
            pictures = iPictureService.getAllPictures();
        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }

        return new ResponseEntity<>(pictures, HttpStatus.OK);
    }
}
