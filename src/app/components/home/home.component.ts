import { HttpClient } from '@angular/common/http';
import { infoCard } from './../../interfaces/infoCard';
import { CarService } from './../../services/car.service';
import { Component } from '@angular/core';
import { Car } from '../../interfaces/car';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent {
  infoCard: infoCard = {
    title: 'O stronie',
    icon: 'fas fa-info-circle fa-2x icon font-light',
    description:
      'Jest to pokazowy projekt strony ze sprzedażą aut używanych. W zakładce "Oferty" znajdziemy wszystkie dodane ogłoszenia. Oferty można również filtrować przy użyciu panelu do wyszukiwania. Kliknięcie w link "Dodaj Ogłoszenie" otworzy formularz ogłoszenia. Wszystkie pola oraz przynajmniej jedno zdjęcie są wymagane. Linki do zdjęć są dynamicznie sprawdzane przed dodaniem. Na stronę główną możemy dostać się klikając zarówno w logo strony jak i zakładke "Strona Główna"',
    button: 'Więcej',
    link: '/about',
  };

  buyCard: infoCard = {
    title: 'Chcesz kupić auto?',
    icon: 'fas fa-shopping-cart fa-2x icon font-light',
    description:
      'Na naszej stronie znajdziesz oferty sprzedaży aut nowych i używanych z całej Polski. W prosty sposób znajdziesz oraz zakupisz auto spełniające wszystkie Twoje potrzeby!',
    button: 'Kup auto',
    link: '/cars',
  };

  sellCard: infoCard = {
    title: 'Chcesz sprzedać auto?',
    icon: 'fas fa-car fa-2x icon font-light',
    description:
      'Jeżeli chcesz w łatwy i szybki sposób sprzedać samochód zamieść ogłoszenie na naszej stronie. Od sprzedania samochodu dzieli Cię tylko jeden łatwy do uzupełnienia formularz!',
    button: 'Sprzedaj auto',
    link: '/add',
  };

  constructor(private http: HttpClient) {
    http.get('https://find-your-car-spring.herokuapp.com/car/get/0').subscribe((response) => {});
  }
}
