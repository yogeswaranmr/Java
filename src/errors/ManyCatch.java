package errors;

public class ManyCatch {
    static void main() {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }catch(Exception e){
            System.out.println("Something else!");
        } // order of catch matters - put general errors at last!
    }
}
