import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // ... other existing methods ...

    // Method to calculate the average rating of all books
    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0.0;
        for (Book book : books) {
            totalRating += book.getRating();
        }
        return totalRating / books.size();
    }

    // Method to find the book with the most reviews
    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }

        Book mostReviewedBook = books.get(0);
        for (Book book : books) {
            if (book.getReviewCount() > mostReviewedBook.getReviewCount()) {
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook;
    }
}
