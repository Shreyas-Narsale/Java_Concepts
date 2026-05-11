
import java.lang.*;



class Singleton {
    private static Singleton instance;
    private String value;

    //private constructor - within class object creation
    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public void Display(){
        System.out.println(this.value);
    }
}

class Main{
    public static void main(String args[]){

       // Singleton s1= new Singleton(); // not allowed
       Singleton s1= Singleton.getInstance("first");
       s1.Display(); // first

        Singleton s2= Singleton.getInstance("second");
       s2.Display(); // first

    }
}
