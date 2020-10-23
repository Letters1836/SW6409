package com.example.midterm.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.midterm.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
