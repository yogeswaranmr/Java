package methods;

public class Scope {
    static void main() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // cannot access i here
    }
}
