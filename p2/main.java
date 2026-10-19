//Write Java programs to demonstrate all three inheritance structures. For single inheritance, create Vehicle and
//Car classes. For multilevel inheritance, create Person, Employee, and Manager classes. For hierarchical
//inheritance, create a Shape base class with Circle and Rectangle subclasses. Add suitable fields and methods,
//then demonstrate inherited behaviour and display the output.

class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();

        c.display();
        c.start();
    }
}
