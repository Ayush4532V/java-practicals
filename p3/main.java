

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}


class Machine {
    void start() {
        System.out.println("Machine is starting...");
    }
}

class SmartPrinter extends Machine implements Printable, Scannable {

    public void print() {
        System.out.println("SmartPrinter is printing...");
    }

    public void scan() {
        System.out.println("SmartPrinter is scanning...");
    }
}

public class Main {
    public static void main(String[] args) {

       
        AllInOnePrinter p1 = new AllInOnePrinter();
        System.out.println("All-in-One Printer:");
        p1.print();
        p1.scan();

        
        SmartPrinter p2 = new SmartPrinter();
        System.out.println("\nSmart Printer:");
        p2.start();
        p2.print();
        p2.scan();
    }
}
