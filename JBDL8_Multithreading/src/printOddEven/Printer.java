package printOddEven;

public class Printer {

    int counter=1;

    public synchronized void printEven(){
        while (counter<=20){
            if (counter%2==0){
                System.out.println(counter+" "+Thread.currentThread().getName()+" Even");
                counter++;
                notify();
            }else {
               try {
                   wait();
               }
               catch (Exception ex){

               }
            }
        }
    }

    public synchronized void printOdd(){
        while (counter<=20){
            if (counter%2==1){
                System.out.println(counter+" "+Thread.currentThread().getName()+" Odd");
                counter++;
                notify();
            }else {
                try {
                    wait();
                }
                catch (Exception ex){

                }
            }
        }
    }


}
