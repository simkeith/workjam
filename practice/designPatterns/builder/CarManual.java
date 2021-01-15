package designPatterns.builder;

/**
 * @author Simar Preet
 * <p>
 * POJO for Car manual object
 */
public class CarManual {

    int numberOfSeats;
    String typeOfChassis;
    int numberOfWindows;


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
