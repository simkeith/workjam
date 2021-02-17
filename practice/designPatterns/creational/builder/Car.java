package designPatterns.creational.builder;

/**
 * @author Simar Preet
 * POJO for Car object
 */
public class Car {

    int numberOfSeats;
    String typeOfChassis;
    int numberOfWindows;

    public Car() {
    }


    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setTypeOfChassis(String typeOfChassis) {
        this.typeOfChassis = typeOfChassis;
    }


    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }


}
