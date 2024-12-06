package br.com.henrique.book_store_api.service;import jakarta.persistence.*;

import br.com.henrique.book_store_api.entity.Client;
import br.com.henrique.book_store_api.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientService {

    @Autowired
    private IClientRepository clientRepository;

    public Client save(Client client){
        if(client == null)
            throw new IllegalArgumentException("Cliente não pode ser nullo");
        return clientRepository.save(client);
    }

    public Client findById(int id){
        return clientRepository.findById(id)
                .orElse(null);
    }

}
