class Book {
    protected String title;
    protected int year;
    protected String author;

    public Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Year: " + year + ", Author: " + author;
    }
}

class PrintBook extends Book {
    private String publisher;
    private String ISBN;

    public PrintBook(String title, int year, String author, String publisher, String ISBN) {
        super(title, year, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + ", Publisher: " + publisher + ", ISBN: " + ISBN;
    }
}

class AudioBook extends Book {
    private double sizeMB;
    private double playLength;
    private String artist;

    public AudioBook(String title, int year, String author, double sizeMB, double playLength, String artist) {
        super(title, year, author);
        this.sizeMB = sizeMB;
        this.playLength = playLength;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + sizeMB + "MB, Length: " + playLength + " hrs, Artist: " + artist;
    }
}

public class BookHierarchyDemo {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", 2020, "John Doe");
        PrintBook printBook = new PrintBook("Effective Java", 2018, "Joshua Bloch", "Pearson", "978-0134685991");
        AudioBook audioBook = new AudioBook("Clean Code", 2008, "Robert C. Martin", 250.5, 14.2, "Michael Kramer");

        System.out.println(book);
        System.out.println(printBook);
        System.out.println(audioBook);
    }
}


