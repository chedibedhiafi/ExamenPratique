package tn.esprit.chedibedhiafi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.chedibedhiafi.entities.Clinique;
import tn.esprit.chedibedhiafi.repository.CliniqueRepository;

@Service
public class CliniqueServiceImp implements ICliniqueService{
    @Autowired
    CliniqueRepository cliniqueRepository;


    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }
}
