

public class Person {

      String name;
      String email;
      int age;
      String address;
      String mobileNO; // +91 75748474673
      private long wealth;
      Double fee;


     public void walk(){
         System.out.println("Person is walking");
     }

     public void talk(){
         System.out.println("Person is taling");
     }

     public void eat(){
         System.out.println("Person is eating");
     }

     private void somePrivateMethod(){

     }

     private class InnerClass {
       // we can't make outer class private, but inner class can be private
     }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", mobileNO='" + mobileNO + '\'' +
                ", wealth=" + wealth +
                '}';
    }
}
