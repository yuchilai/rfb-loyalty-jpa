import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';
import { EntityRoutingModule } from 'app/entities/entity-routing.module';
import { LocationListComponent } from './location/location-list/location-list.component';

@NgModule({
  imports: [SharedModule, RouterModule.forChild([HOME_ROUTE]), EntityRoutingModule],
  declarations: [HomeComponent, LocationListComponent],
  exports: [HomeComponent],
})
export class HomeModule {}
