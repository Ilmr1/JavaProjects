import java.util.ArrayList;
import java.util.Iterator;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void borrowBook(String title) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                iterator.remove();
                System.out.println("Book borrowed: " + book);
                return;
            }
        }
        System.out.println("Book not available for borrowing: " + title);
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book);
    }
}
