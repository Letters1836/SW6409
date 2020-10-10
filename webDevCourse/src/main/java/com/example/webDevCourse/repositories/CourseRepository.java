package com.example.webDevCourse.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.webDevCourse.models.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {

}
