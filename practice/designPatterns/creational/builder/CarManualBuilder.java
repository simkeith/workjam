package designPatterns.creational.builder;

/**
 * @author Simar Preet
 */
public class CarManualBuilder implements Builder {

    CarManual carManual = new CarManual();

    @Override
    public void buildSeats(int n) {
        carManual.setNumberOfSeats(n);
    }

    @Override
    public void buildWindows(int n) {
        carManual.setNumberOfWindows(n);
    }

    @Override
    public void buildChassis(String type) {
        carManual.setTypeOfChassis(type);
    }

    public CarManual getResult() {
        return carManual;
    }
}
