import java.lang.*;

class MyExcepation extends Exception{
    public MyExcepation(String msg ){
        super(msg);
    }
}

class Test{
    public void show() throws MyExcepation{
        throw new MyExcepation("demo");
    }
}

class Main{
    public static void main(String args[]){
        Test obj= new Test();
        try{
            obj.show();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("final");
        }
    }
}
