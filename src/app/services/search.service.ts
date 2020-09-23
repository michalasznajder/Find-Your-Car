import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Mark } from '../interfaces/mark';
import { Model } from '../interfaces/model';

@Injectable({
  providedIn: 'root',
})
export class SearchService {
  private getMarksUrl = 'https://find-your-car-spring.herokuapp.com/mark/get/all';
  private getModelsUrl = 'https://find-your-car-spring.herokuapp.com/model/get/all';
  private years = [
    2020,
    2019,
    2018,
    2017,
    2016,
    2015,
    2014,
    2013,
    2012,
    2011,
    2010,
    2009,
    2008,
    2007,
    2006,
    2005,
    2004,
    2003,
    2002,
    2001,
    2000,
    1999,
    1998,
    1997,
    1996,
    1995,
  ];
  private prices = [5000, 10000, 20000, 30000, 40000, 50000, 100000, 150000, 200000, 250000, 300000, 400000, 500000];
  private fuels = ['diesel', 'petrol', 'electric'];

  constructor(private http: HttpClient) {}

  public getMarks() {
    return this.http.get<Array<Mark>>(this.getMarksUrl);
  }
  public getModels() {
    return this.http.get<Array<Model>>(this.getModelsUrl);
  }
  public getYears() {
    return this.years;
  }
  public getPrices() {
    return this.prices;
  }
  public getFuels() {
    return this.fuels;
  }
}
