package tn.esprit.snoussi_taha_yassine.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.snoussi_taha_yassine.entities.Contrat;
import tn.esprit.snoussi_taha_yassine.repository.ContratRepository;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IContratService;

import java.util.HashSet;
import java.util.Set;

@Service
public class ContratServiceImpl implements IContratService {

    ContratRepository ContratRepository;

    @Override
    public Set<Contrat> retrieveAllContrats(){
        return new HashSet<>(ContratRepository.findAll());
    };

    @Override
    public Contrat retrieveContrat(Long ContratId){
        return ContratRepository.findById(ContratId).get();
    };


    @Override
    public Contrat addContrat(Contrat Contrat){
        return ContratRepository.save(Contrat);
    };


    @Override
    public void removeContrat(Long ContratId){
        ContratRepository.deleteById(ContratId);
    };


    @Override
    public Contrat modifyContrat(Contrat Contrat){
        return ContratRepository.save(Contrat);
    };


}
