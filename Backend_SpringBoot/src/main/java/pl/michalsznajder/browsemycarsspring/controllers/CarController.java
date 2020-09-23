package pl.michalsznajder.browsemycarsspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.michalsznajder.browsemycarsspring.assets.CarFilter;
import pl.michalsznajder.browsemycarsspring.models.Car;
import pl.michalsznajder.browsemycarsspring.services.ICarService;
import pl.michalsznajder.browsemycarsspring.services.IPictureService;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = {"https://findyourcar.azurewebsites.net", "http://localhost:4200"})
@RequestMapping("/car")
public class CarController {
    @Autowired
    private ICarService iCarService;
    @Autowired
    private CarFilter carFilter;




    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getCar(@PathVariable Long id){
        Car car;
        try {
            car = iCarService.getCar(id);
        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(car, HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<Object> createCar(@RequestBody Car car){
        try{
            iCarService.createCar(car);
        }catch (DataAccessException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);

        }
        return new ResponseEntity<>(car.getId(), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Object> updateCar(@RequestBody Car car){
        try{
            iCarService.updateCar(car);
        }catch (DataAccessException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);

        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteCar(@PathVariable Long id){
        try {
            iCarService.deleteCar(id);
        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public ResponseEntity<Object> getAllCars(@RequestParam Map<String, String> params){
        Iterable<Car> cars;
        List<Car> filteredCars;
        try{
            cars = iCarService.getAllCars();
            filteredCars = carFilter.filter(cars, params);

        }catch (DataAccessException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(filteredCars, HttpStatus.OK);
    }
}
