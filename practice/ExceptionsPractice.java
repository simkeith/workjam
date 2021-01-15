import java.io.IOException;

/**
 * @author Simar Preet
 */
public class ExceptionsPractice {

    static void fun() {
        try {
            throw new NullPointerException("demo");
            // any line of code after throw is unreachable. hence CTE(compile time error)
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    public static void main(String args[]){
        try {
            fun();
        } catch (NullPointerException e) {    // executed only if the exception is thrown again. eg. in line 11
            System.out.println("Caught in main().");
        }
    }
}

