import java.lang.*;

/* inheritance: reusibilty
    Single level Inheritance,
    Multi level Inheritance
    Hierarchical level Inheritance
    // multiple inheritance, not allowed in java, to avoid ambiguity problem
 */

class Animal{
    String Name;
    int Age;

    void eat(){
        System.out.println(Name + " eats food");
    }

}

// Single level Inheritance
class Dog extends Animal {
    String Breed;

    void bark(){
        System.out.println(Name + " barks");
    }

    void display() {
        System.out.println("Name: " + Name); // super : to use parent class characertics
        System.out.println("Age: " + Age);
        System.out.println("Breed: " + this.Breed);
    }
}

// Hierarchical level Inheritance: one parent, many children
class Cat extends Animal {
    void meow() {
        System.out.println(Name + " meows");
    }
}

// Multi level Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println(Name + " weeps");
    }
}

class Main{
    public static void main(String args[]){

        Dog obj= new Dog();
        obj.Name ="orero"; // Parent Class obj accesible 
        obj.Age=20; // Parent Class obj accesible 
        obj.Breed = "Labrador";

        obj.eat(); // Parent Class method accesible 
        obj.bark();
        obj.display();
        
    }
}
