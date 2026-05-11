import java.lang.*;

/* Static Variable and Methods:
    - A static variable belongs to the class, not to any object.
    - Only one copy exists in memory even after creating multiple object of Class , Shared across by all objects

    Rules of Static Methods:
    Can access:
        static variables
        other static methods
    Cannot access:
        instance variables
        instance methods
        this keyword
 */

 class Counter {

    static int count = 0;
    public int local;

    static void increment() {
        count++; // allowed ; static variables
        DisplayCounter(); // allowed ; static methods
        // this.local++; // not allowed ,instance variables not allowed
        // DisplayLocal(); // not allowed ,instance methods not allowed
    }

    static void DisplayCounter(){
        System.out.println("Static Count:"+count);
    }

    public void IncrLocal(){
        // count=10; // allowed ; inside regular method ,static allowed
        // DisplayCounter(); // allowed ; inside regular method ,static method allowed
        this.local++;
        DisplayLocal();
    }

    public void DisplayLocal(){
        System.out.println("Local Count:"+this.local);
    }
}

class Main {
    public static void main(String[] args) {

        Counter.increment();
        Counter.increment();
        Counter.increment(); // static method accessible using Class
        System.out.println("Statis Count is:"+ Counter.count); // static variable accessible using Class

        Counter locaObj1=new Counter();
        locaObj1.IncrLocal();
        locaObj1.IncrLocal(); // non static method accesible only using obj
        locaObj1.IncrLocal();
        System.out.println("locaObj1:local: "+ locaObj1.local); // non static variable accesible only using obj
        
        Counter locaObj2=new Counter();
        locaObj2.IncrLocal();
        System.out.println("locaObj2:local: "+ locaObj2.local); // non static variables not shared across obj
    }
}
