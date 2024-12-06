package br.com.henrique.book_store_api.controller;

import br.com.henrique.book_store_api.entity.Client;
import br.com.henrique.book_store_api.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(value = "/save")
    public ResponseEntity<Client> save(@RequestBody Client client){
        return ResponseEntity.ok(clientService.save(client));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> findById(@PathVariable int id){
        return ResponseEntity.ok(clientService.findById(id));
    }
}
