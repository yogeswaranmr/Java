package lambda;

import java.util.Arrays;
import java.util.List;

class DemoShortHand{
    static String lower(String s){
        return s.toLowerCase();
    }
    String upper(String s){
        return s.toUpperCase();
    }
}

public class ShortHandReference {
    static void main() {
        List<String> nums = Arrays.asList("a","b","c");

        // 1. Static Method Reference
        // Syntax: ClassName::staticMethodName

        nums.stream()
                .map(DemoShortHand::lower) // equivalent to: s -> DemoShortHand.lower(s)
                .forEach(System.out::println);

        // 2. Instance Method Reference
        // Case A: Reference to a Specific Object (Bound)
        // Syntax: objectInstance::methodName

        var obj = new DemoShortHand();
        nums.stream()
                .map(obj::upper) // equivalent to: s -> obj.upper(s)
                .forEach(System.out::println);

        // Case B: Reference to an Arbitrary Object (Unbound)
        // Syntax: ClassName::instanceMethodName
        // It expects the First Parameter of the lambda to be the Object calling the method.

        nums.stream()
                .map(String::toLowerCase) // equivalent to: s -> s.toLowerCase()
                .forEach(System.out::println);
    }
}
