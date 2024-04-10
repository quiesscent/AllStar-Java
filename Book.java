import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter for title attribute
    public String getTitle() {
        return title;
    }

    // Getter for author attribute
    public String getAuthor() {
        return author;
    }

    // Getter for ISBN attribute
    public String getIsbn() {
        return isbn;
    }

    public static class BookCollection {
        private ArrayList<Book> books;

        // Constructor
        public BookCollection() {
            books = new ArrayList<>();
        }

        // Method to add a book to the collection
        public void addBook(Book book) {
            books.add(book);
            System.out.println("Book added to collection: " + book.getTitle());
        }

        // Method to remove a book from the collection
        public void removeBook(Book book) {
            if (books.remove(book)) {
                System.out.println("Book removed from collection: " + book.getTitle());
            } else {
                System.out.println("Book not found in collection.");
            }
        }

        // Method to display all books in the collection
        public void displayBooks() {
            System.out.println("Books in the collection:");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
            }
        }
    }

    public static void main(String[] args) {
        // Create a collection of books
        BookCollection collection = new BookCollection();

        // Add books to the collection
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        collection.addBook(book1);
        collection.addBook(book2);

        // Display books in the collection
        collection.displayBooks();

        // Remove a book from the collection
        collection.removeBook(book1);

        // Display books in the collection after removal
        collection.displayBooks();
    }
}
