package functionalinterface;

import java.util.function.Predicate;

// Abstract Method: boolean test(T t)
// Input: One object (T)
// Output: boolean

public class DemoPredicate {
    static Predicate<String> isLong = s -> s.length() > 5;

    static void main() {
        System.out.println(isLong.test("asdf"));
        System.out.println(isLong.test("aaaaaa"));
    }
}
