package tn.esprit.snoussi_taha_yassine.web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.snoussi_taha_yassine.entities.Contrat;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IContratService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/Contrat")

public class ContratController {
    IContratService Contratservice;


    // http://localhost:8089/Contrat/retrieve-all-Contrats
    @GetMapping("/retrieve-all-Contrats")
    public Set<Contrat> getContrats(){
        return Contratservice.retrieveAllContrats();
    }

    // http://localhost:8089/Contrat/retrieve-Contrat/8
    @GetMapping("/retrieve-Contrat/{Contrat-id}")
    public Contrat retrieveContrat(@PathVariable("Contrat-id") Long ContratId){
        return Contratservice.retrieveContrat(ContratId);
    }

    // http://localhost:8089/Contrat/add-Contrat
    @PostMapping("/add-Contrat")
    public Contrat addContrat(@RequestBody Contrat a){
        return Contratservice.addContrat(a);
    }

    // http://localhost:8089/Contrat/remove-Contrat/{Contrat-id}
    @DeleteMapping("/remove-Contrat/{Contrat-id}")
    public void deleteContrat(@PathVariable("Contrat-id") Long ContratId){
        Contratservice.removeContrat(ContratId);
    }

    // http://localhost:8089/Contrat/modify-Contrat
    @PutMapping("/modify-Contrat")
    public Contrat modifyContrat(@RequestBody Contrat a) {
        return Contratservice.modifyContrat(a);
    }



}
