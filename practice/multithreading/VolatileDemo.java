package multithreading;

/**
 * Demo to stop a thread using volatile keyword. Volatile is used to signal threads.
 * It tells the compiler that this particular variable is going to be updated by multiple threads,
 * so always reads it value from the main memory instead of the cache.
 * That ways you’ll always get the most updated value.
 *
 */
public class VolatileDemo {
        // static is used here because a non-static variable cannot be referenced from a static context
        static volatile boolean exit = false;   // exit variable to stop both the main and inside threads

        public static void main(String[] args) {

            System.out.println("started main thread..");

            new Thread() {
                public void run() {
                    System.out.println("started inside thread..");

                    while (!exit) {
                    }

                    System.out.println("exiting inside thread..");
                }
            }.start();

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Caught :" + e);
            }

            // so that we can stop the threads
            exit = true;
            System.out.println("exiting main thread..");
        }

}
