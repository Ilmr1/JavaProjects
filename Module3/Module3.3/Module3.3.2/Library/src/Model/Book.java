package Model;

public class Book {
    String author;
    int ISBN;

    boolean reserved;

    public Book(String author, int ISBN) {
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public boolean isReserved() {
        return reserved;
    }
}
