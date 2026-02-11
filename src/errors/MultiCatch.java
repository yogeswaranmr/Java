package errors;

public class MultiCatch {
    static void main() {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Arithmetic or Array Error Occured!");
        }
    }
}
