import java.util.concurrent.Callable;

public class CallableImpl implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Inside the callable method");
        return 1;
    }
}
