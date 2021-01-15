package lambdas;

/**
 * @author Simar Preet
 * Going to see thread creation before and after lambdas
 * lambdas explanation
 *
 */

// before lambdas, using anonymous inner class we are defining the run method of Runnable
//public class FirstLambdaFunction {
//
//    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread executed");
//            }
//        });
//        t.start();
//    }
//}



// after lambdas, the same code becomes this
public class FirstLambdaFunction {

    public static void main(String[] args) {
        Thread t = new Thread(
                ()-> System.out.println("Thread executed"));
        t.start();
    }
}

/**
 * Basically lambdas are used to implement functional interfaces that have only one abstract method.
 * No need to mention any access specifier, return type or method name. Even the return type can be guessed by
 * the compiler after jdk 1.8 through Type Inference.
 * Only imp thing is the syntax
 *  (<list of 0 or more parameters>) -> single statement for execution
 */


/**
 * Lambdas also help to optimize jvm memory (this concept was introduced in java 7 called Invoke Dynamic).
 * For e.g. if you use a FI to provide two separate definitions
 * then the compiler will create a separate class for each impl provided by you. Which will add more burden to
 *  your war/jar. But with lambdas, there is only file created for the class. So lambdas are lightweight
 */


/**
 *  Lambdas enable - 1. pass behaviour as parameter (just like we pass data variables as method args, we can also pass
 *  FI instance as parameters to a method)
 *  2. declarative programming - i.e. focusing on what to do, rather than how to do.
 *  Functional programming is a subset of Declarative Programming
 */


/**
Lambdas can be used on these 4 types of methods:
 * 1. Methods with no parameters, no return type. e.g. ()->sout("hello")
 * 2. methods with parameters, no return type. e.g. (a,b)->sout(a+b)
 * 3. methods with parameters and return type. e.g. x->x.length();   Here we don't need to write return keyword
 * 4. methods with multiple statements. e.g. (str)->{int l = str.length();
 *                                                       sout(l);
 *                                                       return l;
 *                                                       };
 */
