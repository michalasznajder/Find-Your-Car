import { AboutComponent } from './components/about/about.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { AddAnnouncementComponent } from './components/add-announcement/add-announcement.component';
import { HomeComponent } from './components/home/home.component';
import { BrowseCarsComponent } from './components/browse-cars/browse-cars.component';

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'cars', component: BrowseCarsComponent },
  { path: 'add', component: AddAnnouncementComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: '**', component: PageNotFoundComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
