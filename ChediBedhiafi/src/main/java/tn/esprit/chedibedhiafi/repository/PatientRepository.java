package tn.esprit.chedibedhiafi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.chedibedhiafi.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
