package br.com.henrique.book_store_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    private String name;

    private String document;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;



    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Client(String name, String document, Store store) {
        this.name = name;
        this.document = document;
        this.store = store;
    }

    public Client(){

    }
}
