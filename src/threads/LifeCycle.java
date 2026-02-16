package threads;

public class LifeCycle {
    static void main() throws InterruptedException {
        // 1. NEW State
        Thread t1 = new Thread(new Worker());
        System.out.println("State 1: " + t1.getState()); // Output: NEW

        // 2. RUNNABLE State
        t1.start();
        // We wait slightly to let the OS scheduler pick it up
        System.out.println("State 2: " + t1.getState()); // Output: RUNNABLE (or TIMED_WAITING if it hit sleep fast)
        Thread.sleep(100);

        // 3. TIMED_WAITING State
        // The worker has a Thread.sleep(1000) inside.
        Thread.sleep(100);
        System.out.println("State 3: " + t1.getState()); // Output: TIMED_WAITING

        // 4. WAITING State
        // The worker calls wait() on a lock.
        // We need to notify it to move it to Blocked/Runnable later.
        Thread.sleep(1500);
        System.out.println("State 4: " + t1.getState()); // Output: WAITING

        // 5. BLOCKED State
        // We create a blockage by holding the lock in Main thread
        // Wake up t1. It tries to exit wait(), but WE hold the lock!
        // So t1 gets stuck in BLOCKED state.
        synchronized(Worker.lock) {
            Worker.lock.notify();
            System.out.println("State 5: " + t1.getState()); // Output: BLOCKED
        }
        Thread.sleep(100);

        // 6. TERMINATED State
        t1.join(); // Wait for it to finish
        System.out.println("State 6: " + t1.getState()); // Output: TERMINATED
    }

    static class Worker implements Runnable {
        public static final Object lock = new Object();

        @Override
        public void run() {
            try {
                // For State 3 (Timed Waiting)
                Thread.sleep(1000);

                synchronized (lock) {
                    // For State 4 (Waiting)
                    lock.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
