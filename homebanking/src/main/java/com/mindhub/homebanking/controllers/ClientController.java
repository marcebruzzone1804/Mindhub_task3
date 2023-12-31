package com.mindhub.homebanking.controllers;

import com.mindhub.homebanking.dtos.ClientDTO;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping("/clients")
    public List<ClientDTO> getClients(){
        return clientRepository
                .findAll()
                .stream()
                .map(ClientDTO::new)
                .collect(Collectors.toList());
    }
    @RequestMapping("clients/{id}")
    public ClientDTO getClient(@PathVariable Long id){
        return clientRepository.findById(id)
                .map(ClientDTO::new)
                .orElse(null);
    }
}
