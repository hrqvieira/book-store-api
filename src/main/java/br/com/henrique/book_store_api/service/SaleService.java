package br.com.henrique.book_store_api.service;

import br.com.henrique.book_store_api.entity.Book;
import br.com.henrique.book_store_api.entity.Sale;
import br.com.henrique.book_store_api.entity.SaleBook;
import br.com.henrique.book_store_api.entity.SaleBookId;
import br.com.henrique.book_store_api.repository.IBookRepository;
import br.com.henrique.book_store_api.repository.ISaleRepository;
import br.com.henrique.book_store_api.repository.IStoreRepository;
import br.com.henrique.book_store_api.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class SaleService {

    @Autowired
    private ISaleRepository saleRepository;

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IStoreRepository storeRepository;

    @Autowired
    private IBookRepository bookRepository;

    public Sale createSale(Sale sale){

        Sale savedSale = saleRepository.save(sale);

        for (SaleBook saleBook : savedSale.getSaleBooks()) {
            SaleBookId id = new SaleBookId();
            id.setSaleId(savedSale.get_id());
            id.setBookId(saleBook.getBook().get_id());
            saleBook.setSale(sale);
        }
        return savedSale;
    }

}
