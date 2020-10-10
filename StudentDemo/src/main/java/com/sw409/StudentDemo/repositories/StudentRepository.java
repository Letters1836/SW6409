package com.sw409.StudentDemo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.StudentDemo.models.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
