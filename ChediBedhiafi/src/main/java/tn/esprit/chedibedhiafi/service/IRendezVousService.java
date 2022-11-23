package tn.esprit.chedibedhiafi.service;

import tn.esprit.chedibedhiafi.entities.RendezVous;
import tn.esprit.chedibedhiafi.entities.Specialite;

import java.util.Date;
import java.util.List;

public interface IRendezVousService {
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient);

    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite);

    public int getRevenuMedecin(Long idMedecin, Date startDate, Date endDate);

    public int getNbrRendezVousMedecin(Long idMedecin);
}
