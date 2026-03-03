package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

// Function
// Abstract Method: R apply(T t)
// Input: One object (T)
// Output: One object (R)

// BiFunction
// Same as Function but,
// Takes 2+1 inputs

public class DemoFunction {
    static Function<String, Integer> strToNum = s -> s.length();
    static BiFunction<Double, Integer, Double> numToNum = (d, i) -> d*i;

    static void main() {
        System.out.println("Function results:");
        System.out.println(strToNum.apply("abcd"));
        System.out.println(strToNum.apply("aljsfkasjfl"));

        System.out.println("BiFunction results:");
        System.out.println(numToNum.apply(2.1,2));
        System.out.println(numToNum.apply(1.1,3));
    }
}
