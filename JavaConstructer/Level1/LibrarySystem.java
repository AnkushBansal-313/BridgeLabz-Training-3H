package JavaConstructer.Level1;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    void displayBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}

class EBook extends Book {
    double fileSize;

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", File Size: " + fileSize + "MB, Author: " + getAuthor());
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("ISBN101", "Java Basics", "Ankush");
        b1.displayBookDetails();
        b1.setAuthor("Rohit");
        System.out.println("Updated Author: " + b1.getAuthor());

        EBook eb = new EBook("ISBN202", "Python Advanced", "John", 5.6);
        eb.displayEBookDetails();
    }
}

