package tn.esprit.chedibedhiafi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.chedibedhiafi.entities.Medecin;
import tn.esprit.chedibedhiafi.entities.Patient;
import tn.esprit.chedibedhiafi.entities.RendezVous;
import tn.esprit.chedibedhiafi.entities.Specialite;
import tn.esprit.chedibedhiafi.repository.MedecinRepository;
import tn.esprit.chedibedhiafi.repository.PatientRepository;
import tn.esprit.chedibedhiafi.repository.RendezVousRepository;

import java.util.Date;
import java.util.List;

@Service
public class RendezVousServiceImp implements IRendezVousService{

    @Autowired
    RendezVousRepository rdvRepository;

    @Autowired
    MedecinRepository medecinRepository;

    @Autowired
    PatientRepository patientRepository;
    @Override
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient) {
        Medecin medecin = medecinRepository.findById(idMedecin).orElse(null);
        Patient patient = patientRepository.findById(idPatient).orElse(null);
        rdv.setMedecin(medecin);
        rdv.setPatient(patient);
        rdvRepository.save(rdv);
    }

    @Override
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite) {
        return rdvRepository.findByMedecinCliniquesIdCliniqueAndMedecinSpecialite(idClinique, specialite);
    }

    @Override
    public int getRevenuMedecin(Long idMedecin, Date startDate, Date endDate) {
        int somme=0;
        Medecin m = medecinRepository.findById(idMedecin).get();
        for (RendezVous rdv : m.getRdvs()) {
            if (rdv.getDateRDV().after(startDate) && rdv.getDateRDV().before(endDate) ) {
                somme+= rdv.getMedecin().getPrixConsultation();
            }
        }
        return somme;
    }

    @Override
    public int getNbrRendezVousMedecin(Long idMedecin) {
        return rdvRepository.findByMedecinIdMedecin(idMedecin).size();
    }
}
