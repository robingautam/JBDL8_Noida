package synchronization;

public class SycMain {

    public static void main(String[] args) {
        Table table = new Table();
        TableThread two = new TableThread(table,2);
        TableThread three = new TableThread(table,3);

        two.start();
        three.start();
    }
}
