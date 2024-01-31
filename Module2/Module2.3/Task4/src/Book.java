import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int year;
    private double rating;
    private List<String> reviews;

    // Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.reviews = new ArrayList<>();
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    // Method to set the rating
    public void setRating(double rating) {
        this.rating = rating;
    }

    // Method to add a review
    public void addReview(String review) {
        reviews.add(review);
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\", Author: \"" + author + "\", Year: " + year + ", Rating: " + rating;
    }
}
