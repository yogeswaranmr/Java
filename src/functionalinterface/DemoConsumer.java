package functionalinterface;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

// Consumer
// Abstract Method: void accept(T t)
// Input: One object (T)
// Output: void (Nothing)

// BiConsumer
// Same as Consumer but,
// Takes 2 inputs

public class DemoConsumer {
    static Consumer<Integer> printer = s -> System.out.println("Printing "+s+"...");
    static BiConsumer<Integer, Integer> twoPrinter = (u, v) -> System.out.println("Printing "+u+" and "+v+"...");

    static void main() {
        System.out.println("Consumer results:");
        printer.accept(1);
        printer.accept(2);

        System.out.println("BiConsumer results:");
        twoPrinter.accept(1,2);
        twoPrinter.accept(3,4);
    }
}
