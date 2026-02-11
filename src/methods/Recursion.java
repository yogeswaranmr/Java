package methods;

public class Recursion {
    static int factorial(int i){
        if (i<=1) {
            return 1;
        }
        return i*factorial(i-1);
    }
    static void main() {
        int factorialAns = factorial(5);
        System.out.println("Factorial Answer: "+factorialAns);
    }
}
