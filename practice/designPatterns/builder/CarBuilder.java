package designPatterns.builder;

/**
 * @author Simar Preet
 * <p>
 * Class that builds objects of type Car
 */
public class CarBuilder implements Builder {

    Car car;

    @Override
    public void buildSeats(int n) {
        System.out.println("building car seats");
        car.setNumberOfSeats(n);
    }

    @Override
    public void buildWindows(int n) {
        System.out.println("building car windows");
        car.setNumberOfSeats(n);
    }

    @Override
    public void buildChassis(String type) {
        System.out.println("building car chassis");
        car.setTypeOfChassis(type);
    }

    public Car getResult() {
        return car;
    }

}
