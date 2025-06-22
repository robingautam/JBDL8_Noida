import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread{

    @Override
    public void run() {


       for (int i=1;i<=10;i++){
           try {
             //  this.join();
             //  Thread.sleep(1000);
               System.out.println(i + " Thread 1");
           }
           catch (Exception ex){

           }
       }
    }
}
