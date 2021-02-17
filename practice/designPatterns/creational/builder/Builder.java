package designPatterns.creational.builder;

/**
 * @author Simar Preet
 * <p>
 * Builder with all the steps required to build diff types of objects
 */
public interface Builder {
     void buildSeats(int n);

     void buildChassis(String type);

     void buildWindows(int n);

}
