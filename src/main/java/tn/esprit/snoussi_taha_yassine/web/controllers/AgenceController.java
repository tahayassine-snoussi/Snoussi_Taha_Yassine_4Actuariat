package tn.esprit.snoussi_taha_yassine.web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.snoussi_taha_yassine.entities.Agence;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IAgenceService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")

public class AgenceController {
    IAgenceService agenceservice;


    // http://localhost:8089/agence/retrieve-all-agences
    @GetMapping("/retrieve-all-agences")
    public Set<Agence> getAgences(){
        return agenceservice.retrieveAllAgences();
    }

    // http://localhost:8089/agence/retrieve-agence/8
    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long AgenceId){
        return agenceservice.retrieveAgence(AgenceId);
    }

    // http://localhost:8089/agence/add-agence
    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence a){
        return agenceservice.addAgence(a);
    }

    // http://localhost:8089/agence/remove-agence/{agence-id}
    @DeleteMapping("/remove-agence/{agence-id}")
    public void deleteAgence(@PathVariable("agence-id") Long AgenceId){
        agenceservice.removeAgence(AgenceId);
    }

    // http://localhost:8089/agence/modify-agence
    @PutMapping("/modify-agence")
    public Agence modifyAgence(@RequestBody Agence a) {
        return agenceservice.modifyAgence(a);
    }



}
