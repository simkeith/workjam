package designPatterns.creational.builder;

/**
 * @author Simar Preet
 * <p>
 * Class that builds objects of type Car
 */
public class CarBuilder implements Builder {

    Car car = new Car();

    @Override
    public void buildSeats(int n) {
        car.setNumberOfSeats(n);
    }

    @Override
    public void buildWindows(int n) {
        car.setNumberOfWindows(n);
    }

    @Override
    public void buildChassis(String type) {
        car.setTypeOfChassis(type);
    }

    public Car getResult() {
        return car;
    }

}
