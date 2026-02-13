package string;

public class DemoString {
    static void main() {
        // A. THE POOLING (Unique to String)
        String s1 = "Hello";
        String s2 = "Hello"; // Reuses the same object from the Pool

        System.out.println("1. Pooling Check:");
        System.out.println("   s1 == s2? " + (s1 == s2)); // true (Same memory address)

        // B. THE IMMUTABILITY (Unique to String)
        System.out.println("\n2. Modification Check:");
        int addressBefore = System.identityHashCode(s1);

        s1 = s1 + " World"; // "Modifying" the string

        int addressAfter = System.identityHashCode(s1);

        System.out.println("   Address Before: " + addressBefore);
        System.out.println("   Address After:  " + addressAfter);
        System.out.println("   Result: " + (addressBefore != addressAfter ? "NEW Object Created" : "Same Object"));
    }
}
