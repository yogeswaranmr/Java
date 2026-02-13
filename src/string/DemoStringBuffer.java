package string;

public class DemoStringBuffer {
    static void main() throws InterruptedException {
        // TRIAL 1: StringBuilder (Unsafe)
        StringBuilder unsafeBuilder = new StringBuilder();
        runThreads(unsafeBuilder, "StringBuilder");

        // TRIAL 2: StringBuffer (Safe)
        StringBuffer safeBuffer = new StringBuffer();
        runThreads(safeBuffer, "StringBuffer");
    }

    // Helper to run 2 threads that append 1000 'A's each
    static void runThreads(Appendable obj, String type) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                try { obj.append("A"); } catch (Exception e) {}
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start(); t2.start();
        t1.join(); t2.join(); // Wait for both to finish

        // We expect length to be 2000 (1000 + 1000)
        String result = obj.toString();
        System.out.println(type + " Final Length: " + result.length());

        if (result.length() != 2000) {
            System.out.println("    ️ DATA LOSS DETECTED! (Not Thread Safe)");
        } else {
            System.out.println("    PERFECT COUNT! (Thread Safe)");
        }
        System.out.println("--------------------------------------------------");
    }
}
