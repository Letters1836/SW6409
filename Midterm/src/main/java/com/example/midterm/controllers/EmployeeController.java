package com.example.midterm.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.midterm.models.Employee;
import com.example.midterm.services.EmployeeService;

@RestController
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping("api/employees")
	public Employee createEmployee(@RequestBody Employee e) {
		return empService.createEmployee(e);
	}
	
	// read
	@GetMapping("api/employees")
	public ArrayList<Employee> getAllEmployees() {
		return empService.getAllEmployees();
	}
	
	// update
	@PutMapping("api/employees/{empid}")
	public void updateEmployee(@PathVariable("empid") Integer id, @RequestBody Employee e) {
		empService.updateEmployee(id, e);
	}
	
	// delete
	@DeleteMapping("api/employees/{empid}")
	public void deleteEmployee(@PathVariable("empid") Integer id) {
		empService.deleteEmployee(id);
	}

}
