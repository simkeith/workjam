package multithreading;

/**
 * @author Simar Preet
 */
//class Table {
//
//    void printTable(int n) {
//        synchronized (this) {        //synchronized block
//            for (int i = 1; i <= 5; i++) {
//                System.out.println(n * i);
//                try {
//                    Thread.sleep(400);
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
//            }
//        }
//    }
//}
//
//public class SynchronizedDemo {
//    public static void main(String args[]) {
//        final Table obj = new Table();       //only one object
//
////        Thread t1 = new Thread() {
////            public void run() {
////                obj.printTable(5);
////            }
////        };
//        Thread t1 = new Thread(() ->{ obj.printTable(5);});
//        Thread t2 = new Thread() {
//            public void run() {
//                obj.printTable(100);
//            }
//        };
//
//        t1.start();
//        t2.start();
//    }
//}
//


class Table{

     public static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(100);
            }catch(Exception e){}
        }
    }
}

class MyThread1 extends Thread{
    Table t = new Table();
    public void run(){

        Table.printTable(1);
    }
}

class MyThread2 extends Thread{
    Table t = new Table();
    public void run(){
        Table.printTable(10);
    }
}

class MyThread3 extends Thread{
    Table t = new Table();
    public void run(){
        Table.printTable(100);
    }
}




class MyThread4 extends Thread{
    Table t = new Table();
    public void run(){
        Table.printTable(1000);
    }
}

public class SynchronizedDemo{
    public static void main(String t[]){
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        MyThread3 t3=new MyThread3();
        MyThread4 t4=new MyThread4();
        t1.start();
//        try{
//            t1.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        t2.start();
//        try{
//            t2.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        t3.start();
//        try{
//            t3.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        t4.start();
    }
}