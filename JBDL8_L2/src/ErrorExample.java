public class ErrorExample {

    public static void makePrint(int n){
        if (n==0){
            return;
        }

        makePrint(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        makePrint(5);
    }
}
