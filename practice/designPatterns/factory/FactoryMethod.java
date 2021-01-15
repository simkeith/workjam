package designPatterns.factory;

/**
 * @author Simar Preet
 * Factory method is the best way of creating objects.
 * We create object without exposing the creation logic to the client and
 * refer to newly created object using a common interface.
 * IDENTIFICATION
 * Factory methods can be recognized by creation methods, which create objects from concrete classes,
 * but return them as objects of abstract type or interface.
 * e.g. Calendar.getInstance() accepts different type of times/time zones and returns object of type Calendar.
 * USE WHEN
 * when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
 * provide users with a way to extend the internal components of your application
 */
public class FactoryMethod {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.createShape("circle");
        Shape shape2 = factory.createShape("rectangle");
        shape.draw();
        shape2.draw();
    }
}

/**
 * PROS
 * You avoid tight coupling between the creator and the concrete products.
 * Single Responsibility Principle. You can move the product creation code into one
 * place in the program, making the code easier to support.
 *
 * CONS
 * The code may become more complicated since you need to introduce a lot of new
 * subclasses to implement the pattern.
 */