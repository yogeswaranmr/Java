package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPools {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== 1. FIXED THREAD POOL (Size 2) ===");
        // Only 2 threads will ever exist. Tasks will queue up.
        ExecutorService fixedPool = Executors.newFixedThreadPool(2);
        runTasks(fixedPool, 5);

        // Wait for fixed pool to finish before starting the next demo
        fixedPool.shutdown(); // closing the thread pool, else it won't stop
        fixedPool.awaitTermination(5, TimeUnit.SECONDS);  // pauses main thread till all worker threads complete


        System.out.println("\n=== 2. CACHED THREAD POOL ===");
        // Will create 5 distinct threads because tasks are submitted simultaneously.
        ExecutorService cachedPool = Executors.newCachedThreadPool();
        runTasks(cachedPool, 5);

        cachedPool.shutdown();
        cachedPool.awaitTermination(5, TimeUnit.SECONDS);


        System.out.println("\n=== 3. SINGLE THREAD EXECUTOR ===");
        // Only 1 thread does all the work, strictly in order.
        ExecutorService singlePool = Executors.newSingleThreadExecutor();
        runTasks(singlePool, 5);

        singlePool.shutdown();
    }

    // Helper method to submit 'taskCount' number of tasks
    private static void runTasks(ExecutorService pool, int taskCount) {
        for (int i = 1; i <= taskCount; i++) {
            final int taskId = i;
            pool.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("[" + threadName + "] executing Task " + taskId);

                // Simulate work so the thread is "busy" when the next task arrives
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            });
        }
    }
}