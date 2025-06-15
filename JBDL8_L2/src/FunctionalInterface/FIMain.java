package FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FIMain {

    public static void main(String[] args) {

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };    // anonymous class

        System.out.println(predicate.test(22));
        // Function
        Function<Integer,Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };

        System.out.println(function.apply(2));

        // Consumer

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        consumer.accept(23);

        // Supplier

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 1;
            }
        };

        System.out.println(supplier.get());

        

    }
}
