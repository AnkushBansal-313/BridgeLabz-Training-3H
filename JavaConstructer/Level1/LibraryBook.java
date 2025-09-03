package JavaConstructer.Level1;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have borrowed \"" + title + "\".");
        } else {
            System.out.println("\"" + title + "\" is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Fundamentals", "Ankush", 250, true);
        LibraryBook book2 = new LibraryBook("Python Basics", "John Doe", 300, false);
        book1.display();
        book1.borrowBook();
        book1.display();
        book2.display();
        book2.borrowBook();
    }
}
