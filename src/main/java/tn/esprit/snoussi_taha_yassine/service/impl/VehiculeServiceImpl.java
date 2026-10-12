package tn.esprit.snoussi_taha_yassine.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.snoussi_taha_yassine.entities.Vehicule;
import tn.esprit.snoussi_taha_yassine.repository.VehiculeRepository;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IVehiculeService;

import java.util.HashSet;
import java.util.Set;

@Service
public class VehiculeServiceImpl implements IVehiculeService {

    VehiculeRepository VehiculeRepository;

    @Override
    public Set<Vehicule> retrieveAllVehicules(){
        return new HashSet<>(VehiculeRepository.findAll());
    };

    @Override
    public Vehicule retrieveVehicule(Long VehiculeId){
        return VehiculeRepository.findById(VehiculeId).get();
    };


    @Override
    public Vehicule addVehicule(Vehicule Vehicule){
        return VehiculeRepository.save(Vehicule);
    };


    @Override
    public void removeVehicule(Long VehiculeId){
        VehiculeRepository.deleteById(VehiculeId);
    };


    @Override
    public Vehicule modifyVehicule(Vehicule Vehicule){
        return VehiculeRepository.save(Vehicule);
    };

}
