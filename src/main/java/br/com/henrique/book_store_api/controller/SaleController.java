package br.com.henrique.book_store_api.controller;

import br.com.henrique.book_store_api.entity.Sale;
import br.com.henrique.book_store_api.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sale")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @PostMapping(value = "/create")
    public ResponseEntity<Sale> create(@RequestBody Sale sale){
        Sale createdSale = saleService.createSale(sale);
        return ResponseEntity.ok(createdSale);
    }

}
