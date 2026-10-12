package tn.esprit.snoussi_taha_yassine.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.snoussi_taha_yassine.entities.Equipement;
import tn.esprit.snoussi_taha_yassine.repository.EquipementRepository;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IEquipementService;

import java.util.HashSet;
import java.util.Set;

@Service
public class EquipementServiceImpl implements IEquipementService {

    EquipementRepository EquipementRepository;

    @Override
    public Set<Equipement> retrieveAllEquipements(){
        return new HashSet<>(EquipementRepository.findAll());
    };

    @Override
    public Equipement retrieveEquipement(Long EquipementId){
        return EquipementRepository.findById(EquipementId).get();
    };


    @Override
    public Equipement addEquipement(Equipement Equipement){
        return EquipementRepository.save(Equipement);
    };


    @Override
    public void removeEquipement(Long EquipementId){
        EquipementRepository.deleteById(EquipementId);
    };


    @Override
    public Equipement modifyEquipement(Equipement Equipement){
        return EquipementRepository.save(Equipement);
    };


}
