package tn.esprit.snoussi_taha_yassine.web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.snoussi_taha_yassine.entities.Employe;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IEmployeService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/Employe")

public class EmployeController {
    IEmployeService Employeservice;


    // http://localhost:8089/Employe/retrieve-all-Employes
    @GetMapping("/retrieve-all-Employes")
    public Set<Employe> getEmployes(){
        return Employeservice.retrieveAllEmployes();
    }

    // http://localhost:8089/Employe/retrieve-Employe/8
    @GetMapping("/retrieve-Employe/{Employe-id}")
    public Employe retrieveEmploye(@PathVariable("Employe-id") Long EmployeId){
        return Employeservice.retrieveEmploye(EmployeId);
    }

    // http://localhost:8089/Employe/add-Employe
    @PostMapping("/add-Employe")
    public Employe addEmploye(@RequestBody Employe a){
        return Employeservice.addEmploye(a);
    }

    // http://localhost:8089/Employe/remove-Employe/{Employe-id}
    @DeleteMapping("/remove-Employe/{Employe-id}")
    public void deleteEmploye(@PathVariable("Employe-id") Long EmployeId){
        Employeservice.removeEmploye(EmployeId);
    }

    // http://localhost:8089/Employe/modify-Employe
    @PutMapping("/modify-Employe")
    public Employe modifyEmploye(@RequestBody Employe a) {
        return Employeservice.modifyEmploye(a);
    }



}
