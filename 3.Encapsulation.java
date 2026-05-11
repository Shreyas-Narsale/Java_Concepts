
//Encapsulation:
/*
data (variables) and code (methods) together into a single unit (class) 
Encapsulation = Data hiding + controlled access
You don’t allow direct access to variables; instead, you control them using methods (getters and setters).
 */

import java.lang.*;

class Person{
    private String name; //private variable with data , hidden
    private int age;

    public void setName(String name){ // acess variable through methods
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
}

// public class Main { then file name should be Main
// class main { no need to keep same file name
/*
Public class = main entry point of file
So file name and class name must be same
single public class avaiable in a file

javac 3.Encapsulation.java
java Main
 */
 class Main {
    public static void main(String []args){
        Person obj= new Person();
        obj.setName("Shreyas");
        obj.setAge(25);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }

}

