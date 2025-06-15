package Collections;

import java.util.*;

public class SetInter {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(23);
        set.add(2);
        set.add(1);

     //   System.out.println(set);
        System.out.println(set.contains(2));
        System.out.println(set.contains(45));
      //  set.remove(23);
        System.out.println(set);

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("====Linked HashSet =========");

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(23);
        lhs.add(2);
        lhs.add(2);

        System.out.println(lhs);


        System.out.println("========TreeSet================");

     //   TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder()); for descending order
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(34);
        treeSet.add(23);
        treeSet.add(32);
        treeSet.add(1);

        System.out.println(treeSet);

        TreeSet treeSet1 = new TreeSet();
        treeSet1.add(23);
        treeSet1.add(2);
        treeSet1.add("Robin");
        treeSet1.add("Aakash");

        System.out.println(treeSet1);



    }
}
