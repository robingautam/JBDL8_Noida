import FirstPackage.*;

public class Main {
    public static void main(String[] args) {
        Person object = new Person();
        object.name="Robin";
        object.email="robin@gmail.com";
        object.address = "M.V ph 1";
        object.age=23;
        object.mobileNO="+91 87837272879";
        //object.wealth=83473727; Its a private variable can't be used outside the class

        System.out.println(object);
        System.out.println(object.hashCode());
         //object.eat();

      //   object.somePrivateMethod(); // Its a private method

         Student st = new Student();
        // st.rollNo = 23; // Its default type, can't be access outside the package
         secondPackage.Student st2 = new secondPackage.Student();
    }
}