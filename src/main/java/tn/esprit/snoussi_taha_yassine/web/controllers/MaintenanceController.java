package tn.esprit.snoussi_taha_yassine.web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.snoussi_taha_yassine.entities.Maintenance;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IMaintenanceService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/Maintenance")

public class MaintenanceController {
    IMaintenanceService Maintenanceservice;


    // http://localhost:8089/Maintenance/retrieve-all-Maintenances
    @GetMapping("/retrieve-all-Maintenances")
    public Set<Maintenance> getMaintenances(){
        return Maintenanceservice.retrieveAllMaintenances();
    }

    // http://localhost:8089/Maintenance/retrieve-Maintenance/8
    @GetMapping("/retrieve-Maintenance/{Maintenance-id}")
    public Maintenance retrieveMaintenance(@PathVariable("Maintenance-id") Long MaintenanceId){
        return Maintenanceservice.retrieveMaintenance(MaintenanceId);
    }

    // http://localhost:8089/Maintenance/add-Maintenance
    @PostMapping("/add-Maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance a){
        return Maintenanceservice.addMaintenance(a);
    }

    // http://localhost:8089/Maintenance/remove-Maintenance/{Maintenance-id}
    @DeleteMapping("/remove-Maintenance/{Maintenance-id}")
    public void deleteMaintenance(@PathVariable("Maintenance-id") Long MaintenanceId){
        Maintenanceservice.removeMaintenance(MaintenanceId);
    }

    // http://localhost:8089/Maintenance/modify-Maintenance
    @PutMapping("/modify-Maintenance")
    public Maintenance modifyMaintenance(@RequestBody Maintenance a) {
        return Maintenanceservice.modifyMaintenance(a);
    }



}
