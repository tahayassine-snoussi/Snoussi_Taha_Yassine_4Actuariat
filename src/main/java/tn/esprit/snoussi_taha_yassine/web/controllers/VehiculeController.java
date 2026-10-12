package tn.esprit.snoussi_taha_yassine.web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.snoussi_taha_yassine.entities.Vehicule;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IVehiculeService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/Vehicule")

public class VehiculeController {
    IVehiculeService Vehiculeservice;


    // http://localhost:8089/Vehicule/retrieve-all-Vehicules
    @GetMapping("/retrieve-all-Vehicules")
    public Set<Vehicule> getVehicules(){
        return Vehiculeservice.retrieveAllVehicules();
    }

    // http://localhost:8089/Vehicule/retrieve-Vehicule/8
    @GetMapping("/retrieve-Vehicule/{Vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("Vehicule-id") Long VehiculeId){
        return Vehiculeservice.retrieveVehicule(VehiculeId);
    }

    // http://localhost:8089/Vehicule/add-Vehicule
    @PostMapping("/add-Vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule a){
        return Vehiculeservice.addVehicule(a);
    }

    // http://localhost:8089/Vehicule/remove-Vehicule/{Vehicule-id}
    @DeleteMapping("/remove-Vehicule/{Vehicule-id}")
    public void deleteVehicule(@PathVariable("Vehicule-id") Long VehiculeId){
        Vehiculeservice.removeVehicule(VehiculeId);
    }

    // http://localhost:8089/Vehicule/modify-Vehicule
    @PutMapping("/modify-Vehicule")
    public Vehicule modifyVehicule(@RequestBody Vehicule a) {
        return Vehiculeservice.modifyVehicule(a);
    }



}
