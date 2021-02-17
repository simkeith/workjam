package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.button.Button;
import designPatterns.creational.abstractFactory.checkbox.Checkbox;

/**
 * @author Simar Preet
 */
public class AbstractFactoryImpl {

    AbstractFactory factory;

    public AbstractFactoryImpl(AbstractFactory factory) {
        this.factory = factory;
    }

    public void getFactory() {
        Button button = factory.createButton();
        button.createButton();
        Checkbox checkbox = factory.createCheckbox();
        checkbox.createCheckbox();
    }
}
