package string;

public class DemoStringBuilder {
    static void main() {
        // Mutable
        // Performance - Fastest
        // Not thread safe
        StringBuilder sb = new StringBuilder("Hello");

        // Identity HashCode tells us the actual memory address
        int addressBefore = System.identityHashCode(sb);

        // Perform heavy modifications
        sb.append(" World");
        System.out.println("   After append:   "+sb);
        sb.replace(0, 5, "Hi");
        System.out.println("   After replace:  "+sb);
        sb.delete(2, 3);
        System.out.println("   After delete:   "+sb);
        System.out.println();

        int addressAfter = System.identityHashCode(sb);

        System.out.println("1. Mutability Check:");

        System.out.println("   Final String:   " + sb);
        System.out.println("   Address Before: " + addressBefore);
        System.out.println("   Address After:  " + addressAfter);
        System.out.println("   Result: " + (addressBefore == addressAfter ? "SAME Object (In-Place)" : "New Object"));
    }
}
