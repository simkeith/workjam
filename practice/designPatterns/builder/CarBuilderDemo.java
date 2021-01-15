package designPatterns.builder;

/**
 * @author Simar Preet
 * Builder is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you to produce different types and representations of an object using
 * the same construction code.
 * Its used where we need to add multiple configurations to an object.
 * Identification: The Builder pattern can be recognized in a class,
 * which has a single creation method and several methods to configure the resulting object.
 * E.G.  STRINGBUFFER.append(), STRINGBUILDER.append() - these methods allow several configurations to
 * the resulting object.
 * USES -
 * to get rid of complex constructors which are written only to configure different types of objects
 * to combine complex objects together
 * cons - increases overall complexity due to too many classes
 */
public class CarBuilderDemo {

    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.buildCar(carBuilder);
        Car c = carBuilder.getResult();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.buildCarManual(carManualBuilder);
        CarManual cm = carManualBuilder.getResult();
    }
}
