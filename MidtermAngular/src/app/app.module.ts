import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DisplayComponent } from './display/display.component';
import { routing } from './app-routing.module';
import { EmployeeService } from '../services/EmployeeService';

@NgModule({
  declarations: [
    AppComponent,
    DisplayComponent
  ],
  imports: [
    routing,
    BrowserModule,
    AppRoutingModule
  ],
  providers: [EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
