import { Car } from './../interfaces/car';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class CarService {
  private getCarsURL = 'https://find-your-car-spring.herokuapp.com/car/get/all';
  private getCarsLocallyURL = 'http://localhost:8080/car/get/all';

  constructor(private http: HttpClient) {}

  public getAllCars() {
    return this.http.get<Array<Car>>(this.getCarsURL);
  }

  public getFilteredCars(URL: string) {
    return this.http.get<Array<Car>>(URL);
  }
}
