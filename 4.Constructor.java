import java.lang.*;

/* Constructor:
👉 It is called automatically when you create an object using new.
Same name as class
No return type (not even void)
Called automatically when object is created
Used to initialize variables
Can be overloaded (multiple constructors)
constructors cannot be final , static, abstract
 */

class Person{
    String name;
    int age;

    Person(){ //default constructor
        this("dummy",10); // constructor iteslef call another constructor
    }
    Person( String name,int age ){ // Parameterized Constructor
        this.name= name;
        this.age=age;
    }

    /* default paramter not allowed in java to avoid ambigity
     Person(String name="shreyas",int age=10 ){ // default paramter constructor
        this.name= name;
        this.age=age;
    }
    */

    Person(Person p){ // Copy Constructor
        this.name= p.name;
        if (age < 0) {
            return; // return allowed but not with values
        }
         this.age= p.age;
    }

    public void Display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

}


// private constructor?
/* You cannot create object from outside the class */
class Demo {
    String name;

    private Demo() {
        name = "Hidden";
    }
}

class Main{
    public static void main(String []args){

        Person p1 = new Person();
        p1.Display();

        Person p2 = new Person("Shreyas",25);
        p2.Display();

        Person p3 = new Person("Shreyas",25);
        Person p4 = new Person(p3);
        p4.Display();

        // Demo obj= new Demo(); // not allowed , as contructor is private

    }
}
