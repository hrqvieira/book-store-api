package br.com.henrique.book_store_api.service;

import br.com.henrique.book_store_api.entity.Store;
import br.com.henrique.book_store_api.repository.IStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoreService {

    @Autowired
    private IStoreRepository storeRepository;

    public Store save(Store store){
        if(store == null){
            throw new IllegalArgumentException("Loja não pode estar vazia");
        }
        return storeRepository.save(store);
    }

}
