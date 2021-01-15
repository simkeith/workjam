package designPatterns.builder;

/**
 * @author Simar Preet
 * POJO for Car object
 */
public class Car {

    int numberOfSeats;
    String typeOfChassis;
    int numberOfWindows;

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTypeOfChassis() {
        return typeOfChassis;
    }

    public void setTypeOfChassis(String typeOfChassis) {
        this.typeOfChassis = typeOfChassis;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }


}
