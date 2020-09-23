import { Model } from './../../interfaces/model';
import { SearchService } from './../../services/search.service';
import { Component, EventEmitter, Output } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Mark } from '../../interfaces/mark';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css'],
})
export class SearchComponent {
  defaultSearchURL = 'https://find-your-car-spring.herokuapp.com/car/get/all?';
  marks: Array<Mark>;
  models: Array<Model>;
  years: Array<number>;
  prices: Array<number>;
  @Output() urlChange = new EventEmitter<string>();

  searchForm = new FormGroup({
    mark: new FormControl(''),
    model: new FormControl(''),
    yearFrom: new FormControl(''),
    yearTo: new FormControl(''),
    search: new FormControl(''),
    priceFrom: new FormControl(''),
    priceTo: new FormControl(''),
  });

  constructor(private searchService: SearchService) {
    searchService.getMarks().subscribe((data) => {
      this.marks = data;
    });
    searchService.getModels().subscribe((data) => {
      this.models = data;
    });
    this.years = searchService.getYears();
    this.prices = searchService.getPrices();
  }

  onSubmit() {
    var searchUrl = this.defaultSearchURL;
    for (var form in this.searchForm.value) {
      if (this.searchForm.value[form] != '') {
        searchUrl = searchUrl.concat(form).concat('=').concat(this.searchForm.value[form]).concat('&');
      }
    }
    console.log(searchUrl.toLowerCase().substring(0, searchUrl.length - 1));
    this.urlChange.emit(searchUrl.toLowerCase().substring(0, searchUrl.length - 1));
  }
}
