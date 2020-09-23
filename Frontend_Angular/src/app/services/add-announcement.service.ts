import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Mark } from '../interfaces/mark';
import { Model } from '../interfaces/model';

@Injectable({
  providedIn: 'root',
})
export class AddAnnouncementService {
  private postCarUrl = 'https://find-your-car-spring.herokuapp.com/car/create';
  private postPictureUrl = 'https://find-your-car-spring.herokuapp.com/picture/create';
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
  private fuels = ['diesel', 'benzyna', 'elektryczny'];

  constructor(private http: HttpClient) {}

  public getMarks(): Observable<Array<Mark>> {
    return this.http.get<Array<Mark>>(this.getMarksUrl);
  }
  public getModels(): Observable<Array<Model>> {
    return this.http.get<Array<Model>>(this.getModelsUrl);
  }
  public getYears(): Array<number> {
    return this.years;
  }
  public getPrices(): Array<number> {
    return this.prices;
  }
  public getFuels(): Array<string> {
    return this.fuels;
  }
  public addAnnouncement(car: Object): Observable<Object> {
    return this.http.post(this.postCarUrl, car);
  }
  public addPictures(picture: Object): Observable<Object> {
    return this.http.post(this.postPictureUrl, picture);
  }
  public checkPictureURL(url: string): Observable<Object> {
    return this.http.get(url);
  }
}
