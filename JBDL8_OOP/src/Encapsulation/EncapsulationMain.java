package Encapsulation;


public class EncapsulationMain {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(-23);
        person.setName("Robin");
        person.setEmail("robin@gmail.com");


        System.out.println(person.getAge());
    }
}
