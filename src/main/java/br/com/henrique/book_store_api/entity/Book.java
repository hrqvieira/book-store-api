package br.com.henrique.book_store_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int _id;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    private String title;

    private String author;

    private String edition;

    private String language;

    private long pages;

    private String editor;

    private String format;

    private String gender;

    @Column(length = 3000)
    private String synopsis;

    private BigDecimal price;



    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Book(Store store, String title, String author, String edition, String language, long pages, String editor, String format, String gender, String synopsis, BigDecimal price) {
        this.store = store;
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.language = language;
        this.pages = pages;
        this.editor = editor;
        this.format = format;
        this.gender = gender;
        this.synopsis = synopsis;
        this.price = price;
    }

    public Book(){

    }
}
