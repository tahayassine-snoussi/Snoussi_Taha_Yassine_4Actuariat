package tn.esprit.snoussi_taha_yassine.service.interfaces;

import org.springframework.stereotype.Service;
import tn.esprit.snoussi_taha_yassine.entities.Agence;

import java.util.List;
import java.util.Set;

public interface IAgenceService {

    public Set<Agence> retrieveAllAgences();
    public Agence retrieveAgence(Long AgenceId);
    public Agence addAgence(Agence c);
    public void removeAgence(Long AgenceId);
    public Agence modifyAgence(Agence Agence);

}
