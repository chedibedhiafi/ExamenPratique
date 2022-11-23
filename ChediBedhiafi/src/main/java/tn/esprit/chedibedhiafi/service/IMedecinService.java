package tn.esprit.chedibedhiafi.service;

import tn.esprit.chedibedhiafi.entities.Medecin;

public interface IMedecinService {
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId);
}
