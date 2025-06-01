package constructor;

public class Person {

    int id;
    String name;
    String email;
    static String collegeName = "IIT";

 /*   public Person(){     // constructor, default constructor

    }*/

    public Person(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }


    public void someMethod(Person p){

    }

    public void anotherMethod(){
        someMethod(this);
    }
}
