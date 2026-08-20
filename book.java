import java.util.ArrayList;

class Book {
    // Attributes
    private String title;
    private String author;
    private String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    // Display book information
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

public class BookCollection {
    // Collection of books
    private ArrayList<Book> books = new ArrayList<>();

    // Method to add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    // Method to remove a book using ISBN
    public void removeBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                books.remove(book);
                System.out.println("Book removed successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Method to display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the collection.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
            System.out.println("-------------------");
        }
    }

    // Main method
    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

        // Create books
        Book book1 = new Book(
            "Java Programming",
            "John Smith",
            "123456789"
        );

        Book book2 = new Book(
            "Object-Oriented Programming",
            "Jane Doe",
            "987654321"
        );

        // Add books
        collection.addBook(book1);
        collection.addBook(book2);

        // Display books
        System.out.println("\nBooks in Collection:");
        collection.displayBooks();

        // Remove a book
        collection.removeBook("123456789");

        // Display remaining books
        System.out.println("\nAfter Removing a Book:");
        collection.displayBooks();
    }
}