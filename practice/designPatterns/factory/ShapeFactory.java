package designPatterns.factory;

/**
 * @author Simar Preet
 */
public class ShapeFactory {

    public Shape createShape(String shape) {
        if (shape == "circle") {
            return new Circle();
        } else {
            return new Rectangle();
        }
    }

}
