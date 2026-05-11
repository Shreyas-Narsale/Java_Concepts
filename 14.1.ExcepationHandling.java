import java.io.FileReader;
import java.io.IOException;
import java.lang.*;

/* Excepation:
     unwanted or unexpected event that occurs during program execution. 
     
*/

class Test{
    public void show() throws Exception{
        throw new IOException("eror");
    }
}

class Main{
    public static void main(String []args){
        // try{
        //     int iRet= 10/1;
        //     FileReader file = new FileReader("abc.txt");

        // }catch(ArithmeticException ae){
        //     System.out.println("error");
        // }catch(IOException ie){
        //     System.out.println("IOException");
        // }
        // finally{
        //     System.out.println("Operatione done");
        // }

        // int age = 19;

        // if (age<0){
        //     throw new ArithmeticException("Invalid age number");
        // }

        // System.out.println("Eligible");

        Test obj= new Test();
        try {
            obj.show();
        }catch(Exception e){
            System.out.println(e);
        }   
        
    }
}
