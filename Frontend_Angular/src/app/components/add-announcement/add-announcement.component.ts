import { AddAnnouncementService } from './../../services/add-announcement.service';
import { Mark } from './../../interfaces/mark';
import { FormGroup, FormControl, FormArray, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';
import { Model } from './../../interfaces/model';

@Component({
  selector: 'app-add-announcement',
  templateUrl: './add-announcement.component.html',
  styleUrls: ['./add-announcement.component.css'],
})
export class AddAnnouncementComponent {
  marks: Array<Mark>;
  models: Array<Model>;
  years: Array<number>;
  prices: Array<number>;
  fuels: Array<string>;
  successfull = false;

  addCarForm = new FormGroup({
    mark: new FormControl('', Validators.required),
    model: new FormControl('', Validators.required),
    yearOfProduction: new FormControl('', Validators.required),
    fuel: new FormControl('', Validators.required),
    horsepower: new FormControl('', [Validators.required, Validators.min(1)]),
    mileage: new FormControl('', [Validators.required, Validators.min(0)]),
    used: new FormControl('', Validators.required),
    price: new FormControl('', [Validators.required, Validators.min(0)]),
    description: new FormControl('', [Validators.required, Validators.maxLength(200)]),
    pictureURL: new FormControl(''),
    pictures: new FormArray([], Validators.required),
  });

  constructor(private addAnnouncementService: AddAnnouncementService) {
    addAnnouncementService.getMarks().subscribe((data) => {
      this.marks = data;
    });
    addAnnouncementService.getModels().subscribe((data) => {
      this.models = data;
    });
    this.years = addAnnouncementService.getYears();
    this.prices = addAnnouncementService.getPrices();
    this.fuels = addAnnouncementService.getFuels();
  }

  onSubmit() {
    // check the form
    if (this.addCarForm.invalid) {
      Object.keys(this.addCarForm.controls).forEach((key) => {
        this.addCarForm.get(key).markAsTouched();
      });
      return;
    }

    // get car details
    let newCarId: number;
    let picturesURL = [];
    let picturesFormArray = (this.addCarForm.get('pictures') as FormArray).controls;
    picturesFormArray.forEach((control) => {
      picturesURL.push(control.value);
    });
    let newCar = {
      model: {
        id: this.addCarForm.get('model').value,
      },
      yearOfProduction: this.addCarForm.get('yearOfProduction').value,
      fuel: this.addCarForm.get('fuel').value,
      used: this.addCarForm.get('used').value,
      horsepower: this.addCarForm.get('horsepower').value,
      mileage: this.addCarForm.get('mileage').value,
      price: this.addCarForm.get('price').value,
      description: this.addCarForm.get('description').value,
    };

    // add new car
    this.addAnnouncementService.addAnnouncement(newCar).subscribe(
      (response) => {
        newCarId = parseInt(response.toString());
        picturesURL.forEach((URL) => {
          // add picture
          let newPicture = {
            car: {
              id: newCarId,
            },
            url: URL,
          };
          this.addAnnouncementService.addPictures(newPicture).subscribe((response) => {
            this.addCarForm.get('pictures')['controls'] = [];
            this.addCarForm.reset();
            document.getElementById('inputUrl').classList.remove('is-valid');
            document.getElementById('inputUrl').classList.remove('is-invalid');
            this.successfull = true;
          });
        });
      },
      (error) => {
        console.log(error);
      }
    );
  }

  addPicture(url: HTMLInputElement) {
    (this.addCarForm.get('pictures') as FormArray).push(new FormControl(url.value));
    url.value = '';
    url.classList.remove('is-invalid');
    url.classList.add('is-valid');
  }

  invalidPictureURL(url: HTMLInputElement) {
    if (url.value.length > 0) {
      url.classList.remove('is-valid');
      url.classList.add('is-invalid');
    }
  }

  validPictureURL(url: HTMLInputElement) {
    url.classList.remove('is-invalid');
    url.classList.add('is-valid');
  }

  onURLFocusOut(url: HTMLInputElement) {
    if ((this.addCarForm.get('pictures') as FormArray).length > 0) {
      url.classList.remove('is-invalid');
      url.classList.add('is-valid');
      url.value = '';
    } else {
      url.classList.remove('is-valid');
      url.classList.add('is-invalid');
      url.value = '';
    }
  }
}
