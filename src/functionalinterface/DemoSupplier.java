package functionalinterface;

// Abstract Method: T get()
// Input: None (void)
// Output: One object (T)

import java.util.function.Supplier;

public class DemoSupplier {
   static Supplier<Double> randomizer = () -> Math.random();

    static void main() {
        System.out.println(randomizer.get());
        System.out.println(randomizer.get());
    }
}
