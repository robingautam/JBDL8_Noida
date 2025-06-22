package synchronization;

public class Account {

    double balance;

    public  void withdraw(double amount){
        synchronized (this){
            balance = balance-amount;
            print();
        }

    }

    public void print(){
        System.out.println(Thread.currentThread().getName()+" Final balance: "+balance);
    }
}
