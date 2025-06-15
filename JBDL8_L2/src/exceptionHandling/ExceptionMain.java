package exceptionHandling;

public class ExceptionMain {

    public static void main(String[] args) {
        System.out.println("starting of the program");
        int a = 10;
        int b = 0;
//        int c = a/b;
        try {
          //  int arr[] = new int[2]; // 0, 1
            //System.out.println(arr[5]);

            int c = a/b;
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Exception occurred"+ex.getMessage());
        }
        catch (ArithmeticException exception){
            System.out.println("Arithmetic Exception: "+exception);
        }
        finally {
            System.out.println("Finally block, always executed");
        }

        // nested try catch

         try {

             try {
                 // nexted try catch
             }
             catch (Exception ex){

             }

         }
         catch (Exception ec){

         }



         String s= null;
         try {
             if (s == null) {
                 throw new NullPointerException("String is blank "); // custom throw
             }
         }
         catch (NullPointerException ex){

         }


     //   System.out.println(c);


         ThrowsExample throwsExample = new ThrowsExample();
         try {
             throwsExample.doSomeTask();
         }
         catch (Exception ex){


         }
        System.out.println("End of the program");
    }
}
