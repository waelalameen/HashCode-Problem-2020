package models;

import java.util.List;

public class InputDataSet {

    private Info info;

    private List<Library> libraries;

    private List<Book> books;

    public InputDataSet() {
    }

    public InputDataSet(Info info, List<Library> libraries, List<Book> books) {
        this.info = info;
        this.libraries = libraries;
        this.books = books;
    }

    public Info getInfo() {
        return info;
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "models.InputDataSet{" +
                "info=" + info +
                ", libraries=" + libraries +
                ", books=" + books +
                '}';
    }
}
