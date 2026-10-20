
class Book {
    String title;
    String author;
    double price;

    
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

   
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

  
    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

   
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------");
    }
}

public class Main {
    public static void main(String[] args) {

        
        Book b1 = new Book();

        
        Book b2 = new Book("Java Basics", "Rahul", 450);

       
        Book b3 = new Book(b2);

        System.out.println("Book 1:");
        b1.display();

        System.out.println("Book 2:");
        b2.display();

        System.out.println("Book 3 (Copied):");
        b3.display();

       
        b3.price = 600;
        b3.title = "Advanced Java";

        System.out.println("After modifying copied book:");
        System.out.println("Original Book:");
        b2.display();

        System.out.println("Copied Book:");
        b3.display();
    }
}

