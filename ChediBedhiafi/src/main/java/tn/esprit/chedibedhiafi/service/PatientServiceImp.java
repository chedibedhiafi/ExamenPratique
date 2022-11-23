package tn.esprit.chedibedhiafi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.chedibedhiafi.entities.Patient;
import tn.esprit.chedibedhiafi.repository.PatientRepository;

@Service
public class PatientServiceImp implements IPatientService{

    @Autowired
    PatientRepository patientRepository;
    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);

    }
}
