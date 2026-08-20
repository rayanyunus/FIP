import java.util.ArrayList;

class Book {

    private String title;
    private String author;
    private String ISBN;

  
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }


    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}

public class BookCollection {
 
    private ArrayList<Book> books = new ArrayList<>();

   
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }


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


    public static void main(String[] args) {
        BookCollection collection = new BookCollection();

       
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


        collection.addBook(book1);
        collection.addBook(book2);


        System.out.println("\nBooks in Collection:");
        collection.displayBooks();

       
        collection.removeBook("123456789");


        System.out.println("\nAfter Removing a Book:");
        collection.displayBooks();
    }
}