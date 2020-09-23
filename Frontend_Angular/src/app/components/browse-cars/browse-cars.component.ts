import { Car } from './../../interfaces/car';
import { CarService } from '../../services/car.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-browse-cars',
  templateUrl: './browse-cars.component.html',
  styleUrls: ['./browse-cars.component.css'],
})
export class BrowseCarsComponent {
  cars: Array<Car>;

  constructor(private carService: CarService) {
    carService.getAllCars().subscribe((data) => {
      this.cars = data;
    });
  }

  onFilterChange(event) {
    this.carService.getFilteredCars(event).subscribe((data) => {
      this.cars = data;
    });
  }
}
