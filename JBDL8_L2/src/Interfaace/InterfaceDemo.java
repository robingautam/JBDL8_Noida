package Interfaace;

public interface InterfaceDemo {

     void someMethod();

      default void some(){
        int sum =  sum(2,3);
         System.out.println("Default methods");
     }

     private int sum(int num1, int num2){
         return num1+num2;
     }


}
