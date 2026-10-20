
class Demo {
    Demo() {
        System.out.println("Object is created.");
    }

    void show() {
        System.out.println("Object is being used.");
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collector may clean the object.");
    }
}

public class Main {
    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.show();

        
        obj = null;

       
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}

