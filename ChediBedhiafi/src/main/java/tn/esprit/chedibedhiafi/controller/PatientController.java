package tn.esprit.chedibedhiafi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.chedibedhiafi.entities.Patient;
import tn.esprit.chedibedhiafi.service.IPatientService;

@RestController
public class PatientController {
    @Autowired
    IPatientService patientService;

    @PostMapping("/add_patient")
    public void addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
    }
}
