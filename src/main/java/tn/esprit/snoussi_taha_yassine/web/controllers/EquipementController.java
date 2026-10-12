package tn.esprit.snoussi_taha_yassine.web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.snoussi_taha_yassine.entities.Equipement;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IEquipementService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/Equipement")

public class EquipementController {
    IEquipementService Equipementservice;


    // http://localhost:8089/Equipement/retrieve-all-Equipements
    @GetMapping("/retrieve-all-Equipements")
    public Set<Equipement> getEquipements(){
        return Equipementservice.retrieveAllEquipements();
    }

    // http://localhost:8089/Equipement/retrieve-Equipement/8
    @GetMapping("/retrieve-Equipement/{Equipement-id}")
    public Equipement retrieveEquipement(@PathVariable("Equipement-id") Long EquipementId){
        return Equipementservice.retrieveEquipement(EquipementId);
    }

    // http://localhost:8089/Equipement/add-Equipement
    @PostMapping("/add-Equipement")
    public Equipement addEquipement(@RequestBody Equipement a){
        return Equipementservice.addEquipement(a);
    }

    // http://localhost:8089/Equipement/remove-Equipement/{Equipement-id}
    @DeleteMapping("/remove-Equipement/{Equipement-id}")
    public void deleteEquipement(@PathVariable("Equipement-id") Long EquipementId){
        Equipementservice.removeEquipement(EquipementId);
    }

    // http://localhost:8089/Equipement/modify-Equipement
    @PutMapping("/modify-Equipement")
    public Equipement modifyEquipement(@RequestBody Equipement a) {
        return Equipementservice.modifyEquipement(a);
    }



}
