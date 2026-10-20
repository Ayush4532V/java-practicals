
class Product {
    String name;
    double price;
    int quantity;

    
    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    
    Product(String n) {
        name = n;
        price = 0;
        quantity = 0;
    }

 
    Product(String n, double p) {
        name = n;
        price = p;
        quantity = 0;
    }

    Product(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    
    double totalCost() {
        return price * quantity;
    }

    
    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
        System.out.println("--------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 500);
        Product p4 = new Product("Keyboard", 1000, 2);

        System.out.println("No-argument constructor:");
        p1.display();

        System.out.println("Name-only constructor:");
        p2.display();

        System.out.println("Name and price constructor:");
        p3.display();

        System.out.println("All-fields constructor:");
        p4.display();
    }
}

