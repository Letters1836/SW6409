package com.example.midterm.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.midterm.models.Employee;
import com.example.midterm.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	List<Employee> empList = new ArrayList<Employee>();
	
	// create
	public Employee createEmployee(Employee emp) {
		this.empList.add(emp);
		return empRepository.save(emp);
	}
	
	// read
	public ArrayList<Employee> getAllEmployees() {
		return (ArrayList<Employee>) empRepository.findAll();
	}
	
	// update
	public void updateEmployee(Integer id, Employee emp) {
		Employee oldEmp = empRepository.findById(id).get();
		oldEmp.setEmpName(emp.getEmpName());
		oldEmp.setEmpTitle(emp.getEmpTitle());
		empRepository.save(emp);
	}
	
	// delete
	public void deleteEmployee(Integer id) {
		empRepository.deleteById(id);
	}

}
