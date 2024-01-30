public class LibraryMain {
    public static void main(String[] args) {
        // Creating book instances
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        // Creating a library instance
        Library library = new Library();

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Displaying all books in the library
        System.out.println("Library Catalog:");
        library.displayBooks();

        // Finding and displaying books by a specific author
        System.out.println("\nBooks by Author \"Jane Doe\":");
        library.findBooksByAuthor("Jane Doe");
    }
}
