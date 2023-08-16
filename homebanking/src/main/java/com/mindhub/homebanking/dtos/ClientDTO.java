package com.mindhub.homebanking.dtos;
import com.mindhub.homebanking.models.Client;

import java.util.Set;
import java.util.stream.Collectors;

public class ClientDTO {
    public Long id;
    public String firstName;
    public String lastName;
    public String email;
    private Set<AccountDTO> accounts;

    public ClientDTO(Client client){
        this.id = client.getId();
        this.firstName= client.getFirstName();
        this.lastName = client.getLastName();
        this.email=client.getEmail();
        this.accounts = client.getAccounts().stream().map(element -> new AccountDTO(element)).collect(Collectors.toSet());
    }
}