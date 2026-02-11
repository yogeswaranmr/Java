package basics;

public class Variables {
    static void main() {
        char a = 'a';
        int b = 1;
        float c = 1.2f;
        long d = 1l;
        double e = 1.2;
        boolean f = true;
        String g = "abcd";

        final int h = 0; // constant
        var i = 1.25; // compiler detects type

        // implicit type cast
        // byte -> short -> int -> long -> float -> double
    }
}
