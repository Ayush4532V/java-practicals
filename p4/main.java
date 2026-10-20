
class Calculator {

   
    int add(int a, int b) {
        return a + b;
    }

    
    int add(int a, int b, int c) {
        return a + b + c;
    }

   
    double add(double a, double b) {
        return a + b;
    }
}


class Employee {
    double calculatePay() {
        return 10000;
    }
}


class Manager extends Employee {
    @Override
    double calculatePay() {
        return 30000;
    }
}


class Developer extends Employee {
    @Override
    double calculatePay() {
        return 25000;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Sum of two numbers: " + c.add(10, 20));
        System.out.println("Sum of three numbers: " + c.add(10, 20, 30));
        System.out.println("Sum of decimal numbers: " + c.add(2.5, 3.5));

        Employee e;

        e = new Manager();
        System.out.println("Manager Pay: " + e.calculatePay());

        e = new Developer();
        System.out.println("Developer Pay: " + e.calculatePay());
    }
}

