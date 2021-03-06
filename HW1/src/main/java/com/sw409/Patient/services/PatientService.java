package com.sw409.Patient.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.Patient.models.Patient;
import com.sw409.Patient.repositories.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	PatientRepository patientRepository;
	
	List<Patient> patientList = new ArrayList<Patient>();
	
	public List<Patient> getPatients() {
		return (List<Patient>) patientRepository.findAll();
	}
	
	public Patient postPatient(Patient pat) {
		this.patientList.add(pat);
		return patientRepository.save(pat);
	}
	
	public void updatePatient(Integer id, Patient pat) {
		Patient oldPatient = patientRepository.findById(id).get();
		oldPatient.setGender(pat.getGender());
		oldPatient.setName(pat.getName());
		oldPatient.setIllness(pat.getIllness());
		patientRepository.save(pat);
	}
	
	public void deletePatient(Integer id) {
		patientRepository.deleteById(id);
	}

}
