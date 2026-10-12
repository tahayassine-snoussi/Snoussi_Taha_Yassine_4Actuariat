package tn.esprit.snoussi_taha_yassine.service.interfaces;

import org.springframework.stereotype.Service;
import tn.esprit.snoussi_taha_yassine.entities.Client;

import java.util.Set;


public interface IClientService {
    public Set<Client> retrieveAllClients();
    public Client retrieveClient(Long ClientId);
    public Client addClient(Client c);
    public void removeClient(Long ClientId);
    public Client modifyClient(Client Client);

}
