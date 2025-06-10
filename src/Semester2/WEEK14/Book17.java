package WEEK14;

public class Book17 {
    public String isbn;
    public String title;

    public Book17(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return "ISBN: " + isbn + ", Title: " + title;
    }
}
