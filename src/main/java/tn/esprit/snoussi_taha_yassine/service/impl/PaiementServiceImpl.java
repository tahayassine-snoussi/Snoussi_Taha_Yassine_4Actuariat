package tn.esprit.snoussi_taha_yassine.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.snoussi_taha_yassine.entities.Paiement;
import tn.esprit.snoussi_taha_yassine.repository.PaiementRepository;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IPaiementService;

import java.util.HashSet;
import java.util.Set;

@Service
public class PaiementServiceImpl implements IPaiementService {

    PaiementRepository PaiementRepository;

    @Override
    public Set<Paiement> retrieveAllPaiements(){
        return new HashSet<>(PaiementRepository.findAll());
    };

    @Override
    public Paiement retrievePaiement(Long PaiementId){
        return PaiementRepository.findById(PaiementId).get();
    };


    @Override
    public Paiement addPaiement(Paiement Paiement){
        return PaiementRepository.save(Paiement);
    };


    @Override
    public void removePaiement(Long PaiementId){
        PaiementRepository.deleteById(PaiementId);
    };


    @Override
    public Paiement modifyPaiement(Paiement Paiement){
        return PaiementRepository.save(Paiement);
    };

}
