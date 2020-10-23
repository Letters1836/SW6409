import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { EmployeeService } from '../../services/EmployeeService';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {

  constructor(private employeeService: EmployeeService) { }

  employees: [];

  ngOnInit(): void {
    this.employeeService.findAllEmployees().then(employees => this.employees = employees);
  }

}
