import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private Map<String, User> users = new HashMap<>();

    // ... other existing methods ...

    // Method to add a user
    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    // Updated borrowBook method
    public void borrowBook(String title, String userName) {
        User user = users.get(userName);
        if (user == null) {
            System.out.println("User not found: " + userName);
            return;
        }

        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().equalsIgnoreCase(title)) {
                user.borrowBook(book);
                iterator.remove();
                System.out.println("Book borrowed by " + userName + ": " + book);
                return;
            }
        }
        System.out.println("Book not available for borrowing: " + title);
    }

    // Updated returnBook method
    public void returnBook(Book book, String userName) {
        User user = users.get(userName);
        if (user == null) {
            System.out.println("User not found: " + userName);
            return;
        }

        if (user.returnBook(book)) {
            books.add(book);
            System.out.println("Book returned by " + userName + ": " + book);
        } else {
            System.out.println("This user did not borrow this book: " + book);
        }
    }
}
