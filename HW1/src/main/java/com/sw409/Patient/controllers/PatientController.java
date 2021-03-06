package com.sw409.Patient.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.Patient.models.Patient;
import com.sw409.Patient.services.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService patserv = new PatientService();
	
	@GetMapping("/api/v1/patients")
	public List<Patient> getAllPatients() {
		return this.patserv.getPatients();
	}
	
	@PostMapping("/api/v1/patients")
	public Patient addPatient(@RequestBody Patient pat) {
		return this.patserv.postPatient(pat);
	}
	
	@PutMapping("/api/v1/patients/{patientId}")
	public void updatePatient(@PathVariable("patientId") Integer id, @RequestBody Patient pat) {
		this.patserv.updatePatient(id, pat);
	}
	
	@DeleteMapping("/api/v1/patients/{patientId}")
	public void deltePatient(@PathVariable("patientId") Integer id) {
		this.patserv.deletePatient(id);
	}
	
}
