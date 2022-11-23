package tn.esprit.chedibedhiafi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.chedibedhiafi.entities.Etudiant;
import tn.esprit.chedibedhiafi.service.IEtudiantService;

@RestController
@AllArgsConstructor
public class EtudiantController {
    IEtudiantService iEtudiantService;
    @GetMapping("/getbyid/{id}")
    public Etudiant getbyid (@PathVariable("id") int id){

        return iEtudiantService.getEtudiantById(id);
    }
}
