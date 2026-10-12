package tn.esprit.snoussi_taha_yassine.service.interfaces;


import tn.esprit.snoussi_taha_yassine.entities.Contrat;

import java.util.Set;

public interface IContratService {
    public Set<Contrat> retrieveAllContrats();
    public Contrat retrieveContrat(Long ContratId);
    public Contrat addContrat(Contrat c);
    public void removeContrat(Long ContratId);
    public Contrat modifyContrat(Contrat Contrat);
}
