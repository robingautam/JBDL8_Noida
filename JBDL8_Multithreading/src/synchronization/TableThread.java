package synchronization;

public class TableThread extends Thread{
    int n;

    Table table;

    TableThread(Table table, int n){
        this.table = table;
        this.n = n;
    }

    public void run(){
        table.print(n);
    }
}
