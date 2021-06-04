package designPatterns.creational.builder;

/**
 * @author Simar Preet
 * <p>
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

    public void buildCar(Builder builder) {
        builder.buildSeats(5);
        builder.buildChassis("SUV");
        builder.buildWindows(4);
    }

    public void buildCarManual(Builder builder) {
        builder.buildSeats(5);
        builder.buildChassis("SUV");
        builder.buildWindows(4);
    }

}
