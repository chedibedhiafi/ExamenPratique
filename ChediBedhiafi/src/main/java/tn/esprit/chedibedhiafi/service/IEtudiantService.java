package tn.esprit.chedibedhiafi.service;

import tn.esprit.chedibedhiafi.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {

    public Etudiant getEtudiantById(int id);

    public List<Etudiant> getAllEtudiants();

    public Etudiant addEtudiant(Etudiant e);

    public Etudiant updateEtudiant(Etudiant e);

    public void deleteEtudiant(int id);
}

