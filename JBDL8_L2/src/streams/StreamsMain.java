package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsMain {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,12,34,56,32,45,1,2,1);

        // Find the even numbers
        List<Integer> ans = new ArrayList<>();

        for (int i=0;i<list.size();i++){
            int val = list.get(i);
            if (val%2==0){
                ans.add(val);
            }
        }
        System.out.println(ans);

        //=========== Streams API =================

      List<Integer> finalAns =  list.stream().filter(i-> i%2==0).map(i->  i*i).collect(Collectors.toList());
     //   System.out.println(list); It doesn't make any modification in original list
        // streams takes more memory as compared to loops
        System.out.println(finalAns);


        // sorted

      List<Integer> sortedList =  list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        // distinct

       List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

       List<Integer> limitList = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(limitList);

        // min, max
        int minNum = list.stream().min((i1,i2)->i1-i2).get();
        System.out.println(minNum);

        // reduce

        int sum = list.stream().reduce((i1,i2)->i1+i2).get();
        System.out.println(sum);

        List<String> fruits =  Arrays.asList("apple","banana","apple");





























    }
}
