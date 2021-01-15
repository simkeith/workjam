package multithreading;

/**
 * Explains two techniques of creating threads
 * 1. using runnable interface
 * 2. using thread class
 *
 * @author Simar Preet
 */

//class ThreadCreationDemo implements Runnable{
//    @Override
//    public void run() {
//        try {
//            System.out.println("current thread ----> " + Thread.currentThread().getName());
//        }catch(Exception e) {
//            System.out.println(e);
//        }
//    }
//}

class ThreadCreationDemo extends Thread {

    public void run() {
        try {
            System.out.println("current thread ----> " + Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        //  for (int i = 0; i < 5; i++) {
        // Thread t = new Thread(new ThreadCreationDemo());    // when implementing Runnable
        ThreadCreationDemo t1 = new ThreadCreationDemo();      // when extending Thread
        t1.start();
        ThreadCreationDemo t2 = new ThreadCreationDemo();
        t2.start();
        ThreadCreationDemo t3 = new ThreadCreationDemo();
        t3.start();
        try {
            t2.join(5000);
            System.out.println("t2 joining " + Thread.currentThread().getName());
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }

        try {
            t3.join(5000);
            System.out.println("t3 joining " + Thread.currentThread().getName());
        } catch (InterruptedException e3) {
            e3.printStackTrace();
        }

        // }
    }
}


