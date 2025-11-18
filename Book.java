public class Book {

    private int id;
    private String name;
    private String author;
    private boolean isIssued;

    // Constructor
    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isIssued = false;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean isIssued() {
        return this.isIssued;
    }

    // Methods to issue and return book
    public void issue() {
        this.isIssued = true;
    }

    public void returnBook() {
        this.isIssued = false;
    }
}
