package constructor;

public class Main {

    public static void main(String[] args) {
        Person p = new Person(1,"Robin","robin@gmail.com");

      //  Person p1 = new Person();  Java will not create default constructor here

        System.out.println(Person.collegeName);

      //  System.out.println(p.getClass().getName()); // Used to print the class name
    }
}
