package functionalinterface;

// Abstract Method: R apply(T t)
// Input: One object (T)
// Output: One object (R)

import java.util.function.Function;

public class DemoFunction {
    static Function<String, Integer> strToNum = s -> s.length();
    static void main() {
        System.out.println(strToNum.apply("abcd"));
        System.out.println(strToNum.apply("aljsfkasjfl"));
    }
}
