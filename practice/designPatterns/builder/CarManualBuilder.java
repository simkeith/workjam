package designPatterns.builder;

/**
 * @author Simar Preet
 */
public class CarManualBuilder implements Builder {

    CarManual carManual;

    @Override
    public void buildSeats(int n) {
        System.out.println("building manual for car seats");
        carManual.setNumberOfSeats(n);
    }

    @Override
    public void buildWindows(int n) {
        System.out.println("building manual for car windows");
        carManual.setNumberOfWindows(n);
    }

    @Override
    public void buildChassis(String type) {
        System.out.println("building manual for car chassis");
        carManual.setTypeOfChassis(type);
    }

    public CarManual getResult() {
        return carManual;
    }
}
