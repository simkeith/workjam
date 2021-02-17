package designPatterns.creational;

/**
 * @author Simar Preet
 * <p>
 * Singleton is a creational design pattern that lets you ensure that a class has only one instance,
 * while providing a global access point to this instance.
 * Use the Singleton pattern when a class in your program should have just a single instance
 * available to all clients;
 * for example, a single database object shared by different parts of the program.
 * e.g. in Java - Runtime.getRuntime()
 *
 * The Singleton pattern disables all other means of creating objects of a class
 * except for the special creation method.
 * This method either creates a new object or returns an existing one if it has already been created.
 *
 * Identification: Singleton can be recognized by a static creation method,
 * which returns the same cached object
 *
 * HOW TO IMPLEMENT
 * 1. Add a private static field to the class for storing the singleton instance.
 * 2. Declare a public static creation method for getting the singleton instance.
 * 3. Implement “lazy initialization” inside the static method.
 * It should create a new object on its first call and put it into the static field.
 * 4. Make the constructor of the class private.
 * The static method of the class will still be able to call the constructor, but not the other objects.
 * 5. Go over the client code and replace all direct calls to the singleton’s
 * constructor with calls to its static creation method
 */

class SingletonDemo {

    private static SingletonDemo instance;
    public String value;

    // private constructor to prevent further instantiation
    private SingletonDemo(String value) {
        this.value = value;
    }

    // single access point for the created instance
    public static SingletonDemo getInstance(String value) {
        if (instance == null) {
            instance = new SingletonDemo(value);
        }
        return instance;
    }


}

public class Singleton {
    public static void main(String[] args) {
        SingletonDemo s = SingletonDemo.getInstance("FOO");
        SingletonDemo s1 = SingletonDemo.getInstance("BAR");
        System.out.println("first object = " + s.value);
        System.out.println("second object = " + s1.value);
    }

}


/**
 * PROS
 * You can be sure that a class has only a single instance.
 *  You gain a global access point to that instance.
 *  The singleton object is initialized only when it’s requested for the first time.
 *
 *  CONS
 *  Violates the Single Responsibility Principle. The pattern solves two problems at the time.
 *  The pattern requires special treatment in a multithreaded environment
 *  so that multiple threads won’t create a singleton object several times
 *  It may be difficult to unit test the client code of the Singleton
 */
