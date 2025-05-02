class Book {
    String title;
    String author;
    int publicationYear;

    // Default constructor
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown Author";
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Constructor with title, author, and publication year
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + (publicationYear != 0 ? publicationYear : "N/A"));
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Basics", "James Gosling");
        Book book3 = new Book("Effective Java", "Joshua Bloch", 2008);

        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
    }
}
