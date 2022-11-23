package tn.esprit.chedibedhiafi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.chedibedhiafi.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
}
