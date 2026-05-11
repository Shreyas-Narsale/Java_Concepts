import java.lang.*;

// About Static Block
/*
    run only once when the class is loaded into memory by the JVM. 
    Even if you create 100 objects, it runs only once 
    Before Main
    Before constructor 
    Before any object creation 
    Executed during class loading phase
    we can acess static variables and methods inside static block
 */
class Test {

    int i, j;                 // instance variables
    static int k = 10;       // static variable (class level)

    // Static Block 1
    static {
        System.out.println("Inside Static Block 1"); // 3rd call

        // Not allowed: instance variable access
        // i = 10;

        // ✔ Allowed: static variable
        k++;

        // ✔ Allowed: calling static method
        //show();
    }

    // Static Block 2 (executes after Static Block 1)
    static {
        System.out.println("Inside Static Block 2");  // 4th call
    }

    // Constructor (runs when object is created)
    public Test() {
        System.out.println("Inside Constructor"); // 5th Call
    }

    // Static method
    public static void show() {
        System.out.println("Inside Static Method"); // 6th Call
    }
}

class Main {

    // Static block in Main class
    static {
        System.out.println("Main Class Static Block"); // 1st call
    }

    public static void main(String[] args) {

        System.out.println("Inside Main Method");  // 2nd call
        Test obj1 ; // does not load Test class here, so no static block call
        //Test.show(); // Class loaded , static block excuted
         Test obj = new Test();

        // Test.show();
    }
}
