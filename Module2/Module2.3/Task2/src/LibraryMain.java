public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book book2 = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book book3 = new Book("The Art of Fiction", "Alice Johnson", 2019);

        Library library = new Library();

        System.out.println("\nBorrowing a book:");
        library.borrowBook("Data Structures and Algorithms");

        System.out.println("\nTrying to borrow the same book again:");
        library.borrowBook("Data Structures and Algorithms");

        System.out.println("\nLibrary Catalog after borrowing:");
        library.displayBooks();

        System.out.println("\nReturning a book:");
        library.returnBook(book2);

        System.out.println("\nLibrary Catalog after returning:");
        library.displayBooks();
    }
}