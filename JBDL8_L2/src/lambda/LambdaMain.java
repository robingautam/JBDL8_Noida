package lambda;

public class LambdaMain {

    public static void main(String[] args) {
        Interface1 obj = new InterImpl();
        obj.m1();

        Interface1 obj2 = new Interface1() {
            @Override
            public void m1() {
                System.out.println("Inside method m1");
            }
        };

        obj2.m1();

        // =========== Lambda =========================

        Interface1 obj3 = ()-> System.out.println("Inside the method m1");
        obj3.m1();

        Interface2 obj4 = a-> System.out.println("Print: "+a);




    }
}
