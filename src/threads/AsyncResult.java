package threads;

import java.util.concurrent.*;

public class AsyncResult {
    public static void main(String[] args) {
        // 1. Create the Manager
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // 2. Define a Task that RETURNS data (Callable)
        Callable<Integer> complexCalculation = () -> {
            System.out.println("   (Backend) Starting heavy calculation...");
            Thread.sleep(2000); // Simulate 2s work

            // Simulating a potential error (Uncomment to see ExecutionException)
            // if (true) throw new RuntimeException("Calculation Failed!");

            return 100; // Returns an Integer
        };

        System.out.println("(Main) Submitting task...");

        // 3. Submit & Get the 'Future' (The Receipt)
        // Execution starts immediately in background. Main thread continues.
        Future<Integer> futureResult = executor.submit(complexCalculation);

        // 4. Prove Asynchronous behavior (Main keeps working)
        System.out.println("(Main) I can do other stuff while waiting!");

        try {
            // 5. Check status (Non-Blocking)
            while(!futureResult.isDone()) {
                // .isDone() Returns true if finished. Non-blocking.
                System.out.println("(Main) Still waiting...");
                Thread.sleep(500);
            }

            // 6. Get Result (Blocking)
            // Since loop finished, this returns immediately.
            // If we called this earlier, Main would have frozen here.
            Integer result = futureResult.get();
                // If the task is finished, it returns the result immediately.
                // If the task is running, the current thread BLOCKS (pauses) until it finishes.
                // If the task threw an exception, get() throws an ExecutionException.
            System.out.println("(Main) Result is: " + result);

        } catch (InterruptedException e) {
            // Thread interrupted while waiting
        } catch (ExecutionException e) {
            // The Callable threw an exception!
            // We catch it here, unwrapped from the Future.
            System.err.println("(Main) Task failed with: " + e.getCause().getMessage());
        }

        executor.shutdown();
    }
}