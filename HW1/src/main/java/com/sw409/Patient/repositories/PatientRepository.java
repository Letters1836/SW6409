package com.sw409.Patient.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sw409.Patient.models.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer>{

}
