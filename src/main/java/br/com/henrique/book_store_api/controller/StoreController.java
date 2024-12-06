package br.com.henrique.book_store_api.controller;

import br.com.henrique.book_store_api.entity.Store;
import br.com.henrique.book_store_api.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @PostMapping(value = "save")
    public ResponseEntity<Store> save(@RequestBody Store store){
        store = storeService.save(store);
        return ResponseEntity.ok(store);
    }

}
