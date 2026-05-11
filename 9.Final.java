import java.lang.*;
import java.text.DecimalFormat;

/* final:  (constant)
    once defined cannot be changed
    - local varaibles: once defined cannot be changed
    - characerstics variables: can be initialize in constructor
    - Static final variable : must be initiated at declaration
    - method: canoot be overriden by child class
    - class: cannot be inherited
 */

class Animal{
    final int x;// final characerstics variables 
    final static int m = 10;
    Animal(){
        x=10; // final characerstics variables must be iniiated in construtor
        // m= 11; // final static not allowed
    }

    final void show(){
        System.out.println("Inside Animal main");
        
    }

}

class Dog extends Animal{

    // final void show(){ // not allowed: final method cannot be overriden
    //     System.out.println("Inside Dog main");
    // }

}

final class  Demo {

}

// class Fun extends Demo{ // not alllowed : final class cannot be inherited
// }

class Main{
    public static void main(String args[]){
        final int a=10; //local final variable
        final int b; //local final variable
        b=11; // allowed
        //b=11; // not allowed
        // a=12; not allowed
        //a++;
        Animal aObj= new Dog();
        // aObj.x= 30; // not allowed
        // a++;// not allowed
    }
}
