import java.lang.*;

/* Super and this:
    super:
        - using super we can access everything which is not private
        - we can access characterics of parnet class
        - we can call methods of parnet class
        - we can call to constructor of parnet class
        - super() must also be first statement in child constructor.
    
    this:
        - to refer current class characertics
        - to call current class method
        - to call current class constructor
        - to pass current object

    You cannot use this and super together in constructor
 */

class Animal{
    String Name;
    int Age;

    public Animal(){
        this("dummy",0); 
    }

    public Animal(String name, int age){
        this.Name=name;
        this.Age=age;
        this.eat(); 
    }

    void eat(){
        System.out.println(this.Name + " eats food");
    }

    void DisplyAnimal(){
        System.out.println("Name: " + this.Name);
        System.out.println("Age: " + this.Age);
    }

}

class Dog extends Animal {
    String Breed;

    public Dog(){
         //super(); //not allowed : You cannot use this and super together in constructor
        this("dummy",10,"ex"); // this: to call current class constructor
    }

    public Dog(String name ,int age ,String breed ){
        super(name, age); // super : to call parent class constructor
        /* super() must also be first statement in constructor. */
        this.Breed= breed; // this: to refer class characertics
    }

    void bark(){
        System.out.println(super.Name + " barks"); // super : to use parent class characertics
    }

    void DisplayDog(){
         System.out.println("Breed: " + this.Breed); // this: to refer class characertics
    }

    void Display() {
        super.DisplyAnimal();  // super : we can call methods of parnet class
        this.DisplayDog(); // this : to call current class method
    }

    void PrintStatment(Dog d){
        System.out.printf("Name is: %s, Age is: %d, Breed is: %s.",super.Name ,super.Age, this.Breed );

    }

    void show() {
        PrintStatment(this); // this: to pass current object 
    }

    
}

class Main{
    public static void main(String args[]){

        Dog obj= new Dog("puppy", 8, "shefered");

        obj.eat();
        obj.bark();
        obj.Display();

        obj.show();

    }
}
