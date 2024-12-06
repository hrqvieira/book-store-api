package br.com.henrique.book_store_api.entity;

import jakarta.persistence.*;
import org.hibernate.Length;

@Entity
@Table(name = "stores")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String adress;



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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Store(String adress, String name) {
        this.adress = adress;
        this.name = name;
    }

    public Store(){

    }
}
