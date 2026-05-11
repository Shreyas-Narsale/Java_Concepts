import java.lang.*;


class MyThread extends Thread{
    public MyThread(String str){
        super(str);
    }
    public void run(){
        System.out.println("Thread running");
        try{
            Thread.sleep(5*1000);
        }catch(Exception e){
            System.out.println("Excepation:"+e);
        }
        System.out.println("Thread Name:"+Thread.currentThread().getName());
    }
}
class Main{
    public static void main(String args[]){
        MyThread th= new MyThread("thread-1");
        MyThread th1= new MyThread("thread-2");
        th.start();
        try{
            th.join(); // like waitgroup
        }catch (Exception e){

        }
        th1.start();
    }
}
