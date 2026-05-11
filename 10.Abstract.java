import java.lang.*;

/* Abstract Class: 
    is a class which contain zero or more abstract methods
    abstract method: jut prototype defined in class , not actual function defined
    - gives us flexibilty for class and interfcae combination
*/

abstract class Animal {
    abstract void sound(); // abstract method

    void sleep() { // concrete method
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}


class Main{
    public static void main(String args[]){
        Animal aObj= new Dog(); // upcasting ,// it shows we follow Animal class
        aObj.sleep();
        aObj.sound(); // abstrac method
        
    }
}
