package lambdas;

/**
 * @author Simar Preet
 * FI is an interface with just one abstract method. It can however have one default method as well.
 * creating new functional interface with single abstract method
 * the annotation FunctionalInteface does not make it a functional interface, but is used to check that only
 * one method is provided by the interface
 */

@FunctionalInterface

public interface FirstFunctionalInterface {
    public void myMethod();
     default void defaultVoid(){}           // can have params and/or body
}
