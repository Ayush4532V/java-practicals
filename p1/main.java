//Create a Java class named Student with fields for roll number, name, and marks in three subjects. Add a
//constructor and methods to calculate total marks, percentage, and display the student details. Create at least
//three Student objects and display their details. Identify the class, objects, instance variables, constructor, and
//methods in your program.
class Student {
    int roll;
    String name;
    int m1, m2, m3;

    // Constructor
    Student(int r, String n, int a, int b, int c) {
        roll = r;
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    // Method to calculate total marks
    int total() {
        return m1 + m2 + m3;
    }

    // Method to calculate percentage
    double percentage() {
        return total() / 3.0;
    }

    // Method to display details
    void display() {
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total());
        System.out.println("Percentage: " + percentage() + "%");
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating three objects
        Student s1 = new Student(1, "Aman", 80, 85, 90);
        Student s2 = new Student(2, "Priya", 75, 80, 85);
        Student s3 = new Student(3, "Rahul", 90, 95, 85);

        // Displaying details
        s1.display();
        s2.display();
        s3.display();
    }
}
