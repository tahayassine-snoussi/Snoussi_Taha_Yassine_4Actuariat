package tn.esprit.snoussi_taha_yassine.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.snoussi_taha_yassine.entities.Client;
import tn.esprit.snoussi_taha_yassine.repository.ClientRepository;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IClientService;

import java.util.HashSet;
import java.util.Set;

@Service
public class ClientServiceImpl implements IClientService {

    ClientRepository ClientRepository;

    @Override
    public Set<Client> retrieveAllClients(){
        return new HashSet<>(ClientRepository.findAll());
    };

    @Override
    public Client retrieveClient(Long ClientId){
        return ClientRepository.findById(ClientId).get();
    };


    @Override
    public Client addClient(Client Client){
        return ClientRepository.save(Client);
    };


    @Override
    public void removeClient(Long ClientId){
        ClientRepository.deleteById(ClientId);
    };


    @Override
    public Client modifyClient(Client Client){
        return ClientRepository.save(Client);
    };


}
