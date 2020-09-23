import { Model } from './model';
import { Picture } from './picture';

export interface Car {
  id: number;
  model: Model;
  yearOfProduction: number;
  fuel: String;
  used: boolean;
  horsepower: number;
  mileage: number;
  price: number;
  description: String;
  pictures: Picture[];
}
