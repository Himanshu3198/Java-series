import java.lang.Thread;

class  myThread1 extends Thread{


       @Override
         public void run(){
           int n=5;
           while(n-->0){
//               Thread.sleep(1000);
               System.out.println("Thread1 is running.");
               System.out.println("I am happy!!");
           }
        }

}
class  myThread2 extends Thread{
    @Override
   public  void run(){
        int n=5;
        while(n-->0){
            System.out.println("Thread2 is running..");
            System.out.println("I am sad..");
        }
    }
//    Thread.sleep(10000);

}
public class MultiThreading1 {

      public static void main(String args[]){
//          System.out.println("Hello world..");

          myThread1 t1=new myThread1();
          myThread2 t2=new myThread2();
          t1.start();
          t2.start();


      }


}
