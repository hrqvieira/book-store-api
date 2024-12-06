package br.com.henrique.book_store_api.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.*;

@Entity
@Table(name = "sale_books")
public class SaleBook {

    @EmbeddedId
    private SaleBookId _id;

    @ManyToOne
    @MapsId("saleId")
    @JoinColumn(name = "sale_id")
    @JsonBackReference
    private Sale sale;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "book_id")
    private Book book;

    private int quantity;



    public SaleBookId get_id() {
        return _id;
    }

    public void set_id(SaleBookId _id) {
        this._id = _id;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public SaleBook(Sale sale, Book book, int quantity) {
        this.sale = sale;
        this.book = book;
        this.quantity = quantity;
    }

    public SaleBook(){

    }
}
