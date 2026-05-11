import java.lang.*;
import java.io.IOException;


/*
    Runtime Polymorphism (Method Overriding): (@Override tag, not mendatory, but throws compile time error if not correct)
        - child class provides its own implementation of a method that is already defined in the parent class.
        - Same method name
        - Same parameters
        - Same return type (or compatible)
        - ✔ Covariant return type (allowed)
        -  different access modififer still allowed
            Parent	    Child Allowed
            public	    public only
            protected	protected / public
            default	    default / protected / public
        - private method not allowed
        - final method not allowed, throws compile time error
        - static method not allowed, no error but called base method
        - Constructors can not be Overridden
        - Exception Rules
            Child method:
                Can throw same exceptions
                Can throw narrower (subclass) exceptions
                Cannot throw broader exceptions
        - Variables are NOT overridden, they are hidden
        
 */


class Base{
    int i,j;
    int x = 10;

    public void fun(){
        System.out.println("Inside Base fun");
    }

    public Base getObj(){
        System.out.println("Inside Base getObj");
        return this;
    }

    protected void gun(){
        System.out.println("Inside Base gun");
    }

    private void Do(){
        System.out.println("Inside Base Do");
    }

    public final void mun(){
        System.out.println("Inside Base mun");
    }

    public static void done(){
        System.out.println("Inside Base done");
    }

    public  Exception test(){
        return new Exception();
     }
     

}

class Dervied extends Base{

    int m,n;
    int x = 20;

    //Override
    @Override
    public void fun(){
        System.out.println("Inside Dervied fun");
    }

    //Override
    @Override
   public Dervied getObj(){ // different return type still allowed , reason:✔ Covariant return type (allowed)
        System.out.println("Inside Dervied getObj");
        return this;
    }

    //Override
    /* different access modififer still allowed
    Parent	    Child Allowed
    public	    public only
    protected	protected / public
    default	    default / protected / public
     */
    @Override
    public void gun(){
        System.out.println("Inside Dervied gun");
    }

    // different method not Overriden method, new method
    // @Override //: throws error
    private void Do(){
        System.out.println("Inside Dervied Do");
    }

    // not allowed ; final method cannot be overriden
    // public void mun(){
    //     System.out.println("Inside Dervied mun");
    // }

    // @Override: not allowed
    public static void done(){ // Static methods use compile-time binding, not runtime ,ew method with Dervied class
        System.out.println("Inside Dervied done");
    }

    @Override //allowed as  IOException is subclass Exception
    public  IOException test(){
        return new IOException();
    }

    public void run(){
        System.out.println("Inside Dervied run");
    }

}

class Main{
    public static void main(String args[]){
        Base bObj= new Dervied(); // Upcasting
        /* Only methods visible in the Parent class can be called using bObj.(no private method allowed) */
       // Dervied dObj= new Base(); // DownCasting  , not allowed
       bObj.fun();
       bObj.getObj();
       bObj.gun();
       bObj.done(); // Base Done ****
       // bObj.Do();  not allowed
       // bObj.run(); not allowed
       // bObj.mun();
       System.out.println(bObj.x); // 10, variables are not overriden
    }
}
/*
Question:
 Base bObj= new Dervied(); 
  Dervied bObj= new Dervied(); 
  difference in calling method
 */
