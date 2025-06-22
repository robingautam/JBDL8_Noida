import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {

         Thread t1 = new MyThread();
         t1.start();
         for (int i=1;i<=10;i++){
             try {
                 Thread.sleep(1000);
                 System.out.println(i + " Main Thread");
             }catch (Exception e){

             }
         }

         RunnableImpl runnable = new RunnableImpl();

         Thread t2 = new Thread(runnable);
         t2.start();


         Runnable runnable1 = ()-> System.out.println("Inside the runnable anonymous class");

        Thread t3 = new Thread(()-> System.out.println("Inside the runnable anonymous"));
        t3.start();



        CallableImpl callable = new CallableImpl();

        FutureTask<Integer> future = new FutureTask<>(callable);
        System.out.println(future.isDone());
        System.out.println(future.isCancelled());
        System.out.println(future.cancel(false));
        System.out.println(future.isCancelled());
        Thread threadCall = new Thread(future);
        threadCall.start();


        for (int i=1;i<=1000000;i++){
            Thread thread = new MyThread();
            thread.start();
        }




    }
}