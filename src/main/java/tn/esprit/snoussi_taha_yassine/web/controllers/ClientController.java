package tn.esprit.snoussi_taha_yassine.web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.snoussi_taha_yassine.entities.Client;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IClientService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/Client")

public class ClientController {
    IClientService Clientservice;


    // http://localhost:8089/Client/retrieve-all-Clients
    @GetMapping("/retrieve-all-Clients")
    public Set<Client> getClients(){
        return Clientservice.retrieveAllClients();
    }

    // http://localhost:8089/Client/retrieve-Client/8
    @GetMapping("/retrieve-Client/{Client-id}")
    public Client retrieveClient(@PathVariable("Client-id") Long ClientId){
        return Clientservice.retrieveClient(ClientId);
    }

    // http://localhost:8089/Client/add-Client
    @PostMapping("/add-Client")
    public Client addClient(@RequestBody Client a){
        return Clientservice.addClient(a);
    }

    // http://localhost:8089/Client/remove-Client/{Client-id}
    @DeleteMapping("/remove-Client/{Client-id}")
    public void deleteClient(@PathVariable("Client-id") Long ClientId){
        Clientservice.removeClient(ClientId);
    }

    // http://localhost:8089/Client/modify-Client
    @PutMapping("/modify-Client")
    public Client modifyClient(@RequestBody Client a) {
        return Clientservice.modifyClient(a);
    }



}
