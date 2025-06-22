package printOddEven;

public class OddEvenMain {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread oddThread = new Thread(()->{
            printer.printOdd();
        });
        Thread evenThread = new Thread(()->{
            printer.printEven();
        });

        oddThread.start();
        evenThread.start();
    }
}
