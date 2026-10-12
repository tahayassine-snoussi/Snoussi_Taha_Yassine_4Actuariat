package tn.esprit.snoussi_taha_yassine.service.interfaces;


import tn.esprit.snoussi_taha_yassine.entities.Paiement;

import java.util.Set;

public interface IPaiementService {
    public Set<Paiement> retrieveAllPaiements();
    public Paiement retrievePaiement(Long PaiementId);
    public Paiement addPaiement(Paiement c);
    public void removePaiement(Long PaiementId);
    public Paiement modifyPaiement(Paiement Paiement);
}
