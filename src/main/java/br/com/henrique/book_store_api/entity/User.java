package br.com.henrique.book_store_api.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    private String name;

    private String document;

    private String username;

    private String password;

    private String email;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date creationDate;



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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public User(String name, String document, String username, String password, String email, Date creationDate) {
        this.name = name;
        this.document = document;
        this.username = username;
        this.password = password;
        this.email = email;
        this.creationDate = creationDate;
    }

    public User(){

    }
}
