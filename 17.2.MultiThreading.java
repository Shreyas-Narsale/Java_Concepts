import java.lang.*;


class MyTask implements Runnable {
    public void run(){
        System.out.println("Thread running:"+Thread.currentThread().getName());
    }
}

class Main{
        public static void main(String args[]){
            Thread t1 = new Thread(new MyTask());
            t1.setName("thread1");
            t1.start();
        }
}
