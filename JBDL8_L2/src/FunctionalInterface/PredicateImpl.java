package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return false;
    }
}
