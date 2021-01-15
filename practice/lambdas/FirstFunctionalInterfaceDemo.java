package lambdas;

/**
 * @author Simar Preet
 * demo for using FI
 * after java 8, we can assume functions are variable assignements
 *
 *  1. using lambda to provide method impl while instantiating the FI
 *  2. using lambda to provide method impl in a method, i.e. we can pass behavior in parameters of a method
 */

// 1.
//public class FirstFunctionalInterfaceDemo {
//
//    public static void main(String[] args) {
//        FirstFunctionalInterface demo = () -> System.out.println("Hello");
//        demo.myMethod();
//
//    }
//}


// 2.
public class FirstFunctionalInterfaceDemo {

    public static void main(String[] args) {
        demoMethod(() -> System.out.println("Hello"));
    }

    public static void demoMethod(FirstFunctionalInterface demo){
        demo.myMethod();
    }
}