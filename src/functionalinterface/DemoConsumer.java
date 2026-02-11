package functionalinterface;

import java.util.function.Consumer;

// Abstract Method: void accept(T t)
// Input: One object (T)
// Output: void (Nothing)

public class DemoConsumer {
    static Consumer<Integer> printer = s -> System.out.println("Printing "+s+"...");

    static void main() {
        printer.accept(1);
        printer.accept(2);
    }
}
