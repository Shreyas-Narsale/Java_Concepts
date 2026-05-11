import java.lang.*;


class datatypes {
   
    public static void main(String args[]){

        int age =10;
        double dAge = (int) age;
        System.out.println(dAge);

        double salary = 300000.750;
        int sal = (int) salary;
        System.out.println(sal);

        int a= 5;
        int b= 2;
        System.out.println(a/b); // int 2 , ignore decimal
        System.out.println((double)(a/b)); //2.0
        System.out.println((double)a/b); // 2.5


        char grade ='A';
        int marks = grade + 10;//grade asscii value 65 +10
        System.out.println(marks);

        char baseChar ='A';
        int pos = 10;
        char nextChar = (char)((int)baseChar+pos);
        System.out.printf("%c\n",nextChar);

        boolean isPassed = true;
        if (isPassed ){
            System.out.printf("%b\n",isPassed);
        }

        char ch1= 'A';
        int iCh = 65;
        if (iCh==ch1){
            System.out.println("true");
        }

        int ag=10;
        System.out.printf("Age: %d\n", ag +10);
        System.out.println("Age: "+ag+10); // println only accept string // Age1010
        System.out.println("Age: "+(ag+10)); //20

        float f = 10.5f; // f at last
        System.out.printf("Value: %f", f);

        double d = 10.5;
        System.out.printf("Value: %f", d);

        double pi = 3.1415926535;
        System.out.printf("Pi: %.2f", pi);

        double d1 ;
        // System.out.printf("%d", d1); // jIllegalFormatConversionException

        final int fAge = 10; //constanst
        // fAge = 20; //not allowed 

       Test obj= new Test();
       System.out.println(obj.x);// default values  0
        System.out.println(obj.b);// default values false
        int x;  // declared not inilzied
        //System.out.println(x); // not allowed , muste need to be iniltized

        byte bVal = 127;
        bVal++;
        System.out.println(bVal); // -128 Byte overflow

        int a1 = 10;
        double b1 = 5.5;
        System.out.println(a1 + b1);// double has more priority, so int promoted to double

        String str = new String();
        System.out.println(str);
    }
}

class Test{
    int x;
    boolean b;
}

