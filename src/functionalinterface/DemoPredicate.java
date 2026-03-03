package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

// Predicate
// Abstract Method: boolean test(T t)
// Input: One object (T)
// Output: boolean

// BiPredicate
// Same as Predicate but,
// Takes 2 inputs

public class DemoPredicate {
    static Predicate<String> isLong = s -> s.length() > 5;
    static BiPredicate<String, Integer> isLongEnough = (s, l) -> s.length() > l;

    static void main() {
        System.out.println("Predicate results:");
        System.out.println(isLong.test("asdf"));
        System.out.println(isLong.test("aaaaaa"));

        System.out.println("BiPredicate results:");
        System.out.println(isLongEnough.test("abcd",3));
        System.out.println(isLongEnough.test("a",5));
    }
}
