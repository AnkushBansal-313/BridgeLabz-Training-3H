package JavaConstructer.Level1;

class Book {
    String title;
    String author;
    double price;

    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book paramBook = new Book("Java Basics", "Ankush Bansal", 299.99);
        defaultBook.display();
        paramBook.display();
    }
}

