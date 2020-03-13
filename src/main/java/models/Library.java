package models;

import java.util.List;

public class Library {

    private int id;

    private int booksCount;

    private List<Book> books;

    private int signUpDays;

    private int shipDays;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBooksCount() {
        return booksCount;
    }

    public void setBooksCount(int booksCount) {
        this.booksCount = booksCount;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getSignUpDays() {
        return signUpDays;
    }

    public void setSignUpDays(int signUpDays) {
        this.signUpDays = signUpDays;
    }

    public int getShipDays() {
        return shipDays;
    }

    public void setShipDays(int shipDays) {
        this.shipDays = shipDays;
    }

    @Override
    public String toString() {
        return "models.Library{" +
                "id=" + id +
                ", booksCount=" + booksCount +
                ", books=" + books +
                ", signUpDays=" + signUpDays +
                ", shipDays=" + shipDays +
                '}';
    }
}
