package tn.esprit.snoussi_taha_yassine.web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.snoussi_taha_yassine.entities.Paiement;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IPaiementService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/Paiement")

public class PaiementController {
    IPaiementService Paiementservice;


    // http://localhost:8089/Paiement/retrieve-all-Paiements
    @GetMapping("/retrieve-all-Paiements")
    public Set<Paiement> getPaiements(){
        return Paiementservice.retrieveAllPaiements();
    }

    // http://localhost:8089/Paiement/retrieve-Paiement/8
    @GetMapping("/retrieve-Paiement/{Paiement-id}")
    public Paiement retrievePaiement(@PathVariable("Paiement-id") Long PaiementId){
        return Paiementservice.retrievePaiement(PaiementId);
    }

    // http://localhost:8089/Paiement/add-Paiement
    @PostMapping("/add-Paiement")
    public Paiement addPaiement(@RequestBody Paiement a){
        return Paiementservice.addPaiement(a);
    }

    // http://localhost:8089/Paiement/remove-Paiement/{Paiement-id}
    @DeleteMapping("/remove-Paiement/{Paiement-id}")
    public void deletePaiement(@PathVariable("Paiement-id") Long PaiementId){
        Paiementservice.removePaiement(PaiementId);
    }

    // http://localhost:8089/Paiement/modify-Paiement
    @PutMapping("/modify-Paiement")
    public Paiement modifyPaiement(@RequestBody Paiement a) {
        return Paiementservice.modifyPaiement(a);
    }



}
