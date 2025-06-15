package Collections;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
    Node(int d, Node m){
        this.data = d;
        this.next = m;
    }

    @Override
    public String toString() {
        return this.data+",";
    }
}
