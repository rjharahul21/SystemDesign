import java.util.*;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private boolean available;

    public Book(String isb, String titl, String autho, int py) {
        this.isbn = isb;
        this.title = titl;
        this.author = autho;
        this.publicationYear = py;
        this.available = true;
    }

    public String getisbn() {
        return this.isbn;
    }

    public String gettitle() {
        return this.title;
    }

    public String getauthor() {
        return this.author;
    }

    public boolean isavalibale() {
        return this.available;
    }

    void setAvailable(boolean ava) {
        this.available = ava;
    }
}