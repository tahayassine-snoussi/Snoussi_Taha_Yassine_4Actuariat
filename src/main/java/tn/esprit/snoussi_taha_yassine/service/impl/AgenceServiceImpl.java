package tn.esprit.snoussi_taha_yassine.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.snoussi_taha_yassine.entities.Agence;
import tn.esprit.snoussi_taha_yassine.repository.AgenceRepository;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IAgenceService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

    AgenceRepository agenceRepository;

    @Override
    public Set<Agence> retrieveAllAgences(){
        return new HashSet<>(agenceRepository.findAll());
    };

    @Override
    public Agence retrieveAgence(Long AgenceId){
        return agenceRepository.findById(AgenceId).get();
    };


    @Override
    public Agence addAgence(Agence agence){
        return agenceRepository.save(agence);
    };


    @Override
    public void removeAgence(Long AgenceId){
        agenceRepository.deleteById(AgenceId);
    };


    @Override
    public Agence modifyAgence(Agence agence){
        return agenceRepository.save(agence);
    };




}
