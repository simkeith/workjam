package lambdas;

import java.util.stream.IntStream;

/**
 * @author Simar Preet
 * Imperative programming is the traditional way of programming which focuses more on how things are done.
 * Declarative style focuses more on what has to be done instead of how.
 * Programming paradigms in general -
 * Imperative : procedural programming (e.g. C), OOPS
 * Declarative : functional programming, OOPS
 *
 * Building a house
 * 1. Imperatively - follow these steps - build the foundation, put in framework, install utilities, add walls, etc.
 * 2. Declaratively - IDC, just build a house. It should have a big kitchen and a front yard, bla bla.
 *
 * When to Use Functional programming-
 * If the language you are using is primarily dedicated to being a “functional” language
 * If you have a fixed set of “things” and you need to add operations to those “things” over time
 * When to use OOP -
 * If the language you are using is built to support it (i.e. Java, Python)
 * If you have a fixed set of operations that you do on “things”, and you need to add more “things” over time.
 */

// 1. Imperative paradigm
//public class ImperativeVsDeclarative {
//
//    public static void main(String[] args) {
//        int sum = 0;
//        for (int i =0;i<=100;i++){
//            if (i % 2 ==0){
//                sum = sum + i;
//            }
//
//        }
//        System.out.println("Sum of even numbers = " + sum);
//    }
//}


// 2. Declarative paradigm
public class ImperativeVsDeclarative {

    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(0,100)
                .filter(i -> i % 2 == 0)  //replaces the if
                .reduce((x,y)->x+y)      // replaces the method body of adding two numbers, line 32
                .getAsInt();
        System.out.println("Sum of even numbers = " + sum);
    }
}

// The second approach is definitely more concise and focuses on what has to be done instead of how to do it.
// Also 2. is threadsafe as there are no changes to the variable 'sum'.
// whereas 1. is not thread safe bcz the variable 'sum' is being modified in each iteration.
// It can lead to data inconsistency in multi code processing env. bcz we are sharing and mutating 'sum'