package synchronization;

public class AccountMain {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();
        account.balance = 1000;

        PaymentThread ATMThread = new PaymentThread(account,200);
        PaymentThread NBThread = new PaymentThread(account,300);

        ATMThread.start();
        NBThread.start();

    }
}

class PaymentThread extends Thread {

    Account account;
    double amount;

    PaymentThread(Account account, double amount){
        this.account = account;
        this.amount = amount;
    }

    public void run(){
        account.withdraw(amount);
    }
}
