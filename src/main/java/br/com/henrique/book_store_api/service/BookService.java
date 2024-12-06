package br.com.henrique.book_store_api.service;

import br.com.henrique.book_store_api.entity.Book;
import br.com.henrique.book_store_api.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    @Autowired
    private IBookRepository bookRepository;

    public Book save(Book book){
        if(book == null)
            throw new IllegalArgumentException("Book não pode estar vazio");
        return bookRepository.save(book);
    }

    public Book findById(int id){
        return bookRepository.findById(id)
                .orElse(null);
    }

    public Page<Book> findAll(Pageable pageable){
        return bookRepository.findAll(pageable);
    }

}
