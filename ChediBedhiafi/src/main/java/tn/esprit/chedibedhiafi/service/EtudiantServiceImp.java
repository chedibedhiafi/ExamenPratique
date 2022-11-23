package tn.esprit.chedibedhiafi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.chedibedhiafi.entities.Etudiant;
import tn.esprit.chedibedhiafi.repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImp implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant getEtudiantById(int id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return null;
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public void deleteEtudiant(int id) {

    }
}
