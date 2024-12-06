package br.com.henrique.book_store_api.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SaleBookId implements Serializable {

    private int saleId;

    private int bookId;

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookID) {
        this.bookId = bookID;
    }

    public SaleBookId(int saleId, int bookId) {
        this.saleId = saleId;
        this.bookId = bookId;
    }

    public SaleBookId(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SaleBookId)) return false;
        SaleBookId that = (SaleBookId) o;
        return saleId == that.saleId && bookId == that.bookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(saleId, bookId);
    }
}
