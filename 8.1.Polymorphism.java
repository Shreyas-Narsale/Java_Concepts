import java.lang.*;

/* Polymorphism: single name , muliple behaviour
    Types: 
        1. Compile-time Polymorphism (Method Overloading)
        2. Runtime Polymorphism (Method Overriding)
 */
/*
    Compile-time Polymorphism (Method Overloading):
        - Multiple methods with the same name but different parameters in the same class. 
 */

class Calculator {

    int add(int x, int y){
        return x+y;
    }

    double add(double x, double y){
        return x+y;
    }

     int add(int x, int y, int z){
        return x+y+z;
    }

}

class Main{
    public static void main(String []args){
        Calculator cal = new Calculator();
        System.out.println(cal.add(10, 20));
        System.out.println(cal.add(10.6, 20.6));
        System.out.println(cal.add(10, 20, 30));
    }
}
