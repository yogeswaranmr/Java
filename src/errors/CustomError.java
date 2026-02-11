package errors;

public class CustomError {
    static void main() {
        int a = 0;
        if (a<0){
            throw new ArithmeticException("Value cannot be zero!");
        }else{
            System.out.println(10/a);
        }
    }
}
