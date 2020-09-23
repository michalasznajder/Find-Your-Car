import { AddAnnouncementComponent } from './components/add-announcement/add-announcement.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { CarComponent } from './components/car/car.component';
import { HomeComponent } from './components/home/home.component';
import { BrowseCarsComponent } from './components/browse-cars/browse-cars.component';
import { HttpClientModule } from '@angular/common/http';
import { SearchComponent } from './components/search/search.component';
import { InfoBlockComponent } from './components/info-block/info-block.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { AboutComponent } from './components/about/about.component';
import { PricePipe } from './pipes/price.pipe';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CarComponent,
    HomeComponent,
    BrowseCarsComponent,
    SearchComponent,
    AddAnnouncementComponent,
    InfoBlockComponent,
    PageNotFoundComponent,
    AboutComponent,
    PricePipe,
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule, FormsModule, ReactiveFormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
