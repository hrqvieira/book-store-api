package br.com.henrique.book_store_api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    @OneToMany(mappedBy = "sale", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<SaleBook> saleBooks;



    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public List<SaleBook> getSaleBooks() {
        return saleBooks;
    }

    public void setSaleBooks(List<SaleBook> saleBooks) {
        this.saleBooks = saleBooks;
    }

    public Sale(User seller, Store store, List<SaleBook> saleBooks) {
        this.seller = seller;
        this.store = store;
        this.saleBooks = saleBooks;
    }

    public Sale(){

    }
}
