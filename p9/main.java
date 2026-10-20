
class Employee {
    String name;
    double salary;
    static int count = 0;

    // No-argument constructor
    Employee() {
        this("Unknown", 0);
    }

    // Parameterized constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    // Static method to display employee count
    static void displayCount() {
        System.out.println("Total Employees: " + count);
    }

    // Display employee details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("----------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Ayush", 25000);
        Employee e3 = new Employee("Rahul", 30000);

        e1.display();
        e2.display();
        e3.display();

        Employee.displayCount();
    }
}

