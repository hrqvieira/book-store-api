package br.com.henrique.book_store_api.controller;

import br.com.henrique.book_store_api.entity.Book;
import br.com.henrique.book_store_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @PostMapping(value = "/save")
    public ResponseEntity<Book> save(@RequestBody Book book){
        book = bookService.save(book);
        return ResponseEntity.ok(book);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Book> findById(@PathVariable int id){
        return ResponseEntity.ok(bookService.findById(id));
    }

    @GetMapping(value = "/findAll")
    public ResponseEntity<Page<Book>> findAll(Pageable pageable){
        return ResponseEntity.ok(bookService.findAll(pageable));
    }

}
