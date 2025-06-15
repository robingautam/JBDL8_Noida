package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListMain {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(2,10);
        int a = 30;
        arrayList.add(a);

        ArrayList<Integer> child = new ArrayList();
        child.add(101);

        arrayList.addAll(child);
     //   arrayList.add("FRobin");
//        arrayList.clear();
    //    arrayList.remove(3);
      //  System.out.println(arrayList);
        //System.out.println(arrayList.get(1));

        int sum = 0;
        for (int i=0;i<arrayList.size();i++){
            sum = sum+(arrayList.get(i));
        }

        System.out.println(sum);


      Iterator<Integer> itr = arrayList.iterator();
      while (itr.hasNext()){
          System.out.println(itr.next());
      //    arrayList.add(34); // Fail fast iterator
      }

        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>();
      copy.add(23);
      copy.add(45);

        System.out.println("=======================================");
    Iterator<Integer> nffi =  copy.iterator();
    while (nffi.hasNext()){
        System.out.println(nffi.next());
        copy.add(56);  // non fail fast
    }

        System.out.println(copy.size());


    }
}
