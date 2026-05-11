import java.lang.*;

/* Interface:
    is a blueprint of a class which contain characertics and methods
    characerstics: by default public static final
    method : by default public abstract
    no concrete method
    cannot create object of interface
    no construtor

    class needs to "implement" interface
    no concerate methods allowed in interface all abstract methods
    absstract vs interface use case:
    if any method that which have same logic across all child classes then we can easily keep in absrtact class

 */

interface Shape {
    double area();
    double circumference();
}

class Circle implements Shape{
    double Radius;
    static final double PI= 3.14;

    Circle(Double radius){
        this.Radius= radius;
    }

    public double area(){
        return (PI* this.Radius *this.Radius);
    }

    public double circumference(){
         return (2 * PI* this.Radius);
    }
}

class Square implements Shape{
    double Size;

    Square(double size){
        this.Size= size;
    }

    public double area(){
        return (this.Size * this.Size);
    }

    public double circumference(){
        return (4 *this.Size );
    }
}

class Main{
    public static void main(String args[]){
        Shape sh = new Circle(10.50);
        System.out.println(sh.area());
        System.out.println(sh.circumference());

        sh = new Square(10.50);
        System.out.println(sh.area());
        System.out.println(sh.circumference());

    }
}
