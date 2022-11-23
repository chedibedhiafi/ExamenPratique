package tn.esprit.chedibedhiafi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.chedibedhiafi.entities.Clinique;
import tn.esprit.chedibedhiafi.entities.Medecin;
import tn.esprit.chedibedhiafi.repository.CliniqueRepository;
import tn.esprit.chedibedhiafi.repository.MedecinRepository;

import javax.transaction.Transactional;

@Service
public class MedecinService implements IMedecinService {
    @Autowired
    CliniqueRepository cliniqueRepository;

    @Autowired
    MedecinRepository medecinRepository;

    @Override
    @Transactional
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        Clinique clinique = cliniqueRepository.findById(cliniqueId).orElse(null);
        clinique.getMedecins().add(medecin);
        return medecinRepository.save(medecin);
    }
}
