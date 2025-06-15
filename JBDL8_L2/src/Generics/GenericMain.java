package Generics;

public class GenericMain {

    public static void main(String[] args) {
        Printer<Integer,Double> printer = new Printer<>();
        printer.print(2,2.3);

        Printer<Double,Integer> printer1 = new Printer<>();
        printer1.print(3.4,1);

        Printer<String,Character> printer2 = new Printer<>();
        printer2.print("Robin",'c');

        GenericQuestionMarkExample<Dog> gq = new GenericQuestionMarkExample<Dog>();
    }
}
