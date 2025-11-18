import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    // Add a new book
    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully!");
    }

    // Display all books
    public void displayBooks() {
        System.out.println("\n--- AVAILABLE BOOKS ---");
        for (Book b : books) {
            System.out.println(b.getId() + " | " + b.getName() + " | " + b.getAuthor() + 
                " | Issued: " + b.isIssued());
        }
    }

    // Issue a book
    public void issueBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (!b.isIssued()) {
                    b.issue();
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book is already issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // Return a book
    public void returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (b.isIssued()) {
                    b.returnBook();
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book was not issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
}
