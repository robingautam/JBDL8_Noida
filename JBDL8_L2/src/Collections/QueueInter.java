package Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInter {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();  // queue

     //   LinkedList<Integer> list = new LinkedList<>(); // list

        queue.add(23);
        queue.add(24);
        queue.add(34);

      /* int val1 =  queue.remove(); // 23
        int val2 = queue.remove(); // 24
        int val3 = queue.remove(); // 34
     //    int val4 = queue.remove();
        queue.poll();*/
        int val1 =  queue.peek(); // 23
        int val2 = queue.peek(); // 24
        int val3 = queue.peek();

        System.out.println(queue.size());

        System.out.println(val1+" "+val2+" "+val3);


        Deque<Integer> deque = new LinkedList<>();
        deque.add(23);
        deque.add(25);
        deque.addFirst(21);
        deque.addLast(45);
        deque.add(56);

        System.out.println(deque.remove());

        System.out.println("===priority queue =====");

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(23);
        pq.add(45);
        pq.add(1);

         int p1 = pq.remove();
         int p2 = pq.remove();
         int p3 = pq.remove();
        System.out.println(p1+" "+p2+" "+p3);



    }
}
