package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.button.Button;
import designPatterns.creational.abstractFactory.checkbox.Checkbox;

/**
* @author Simar Preet
*/
public interface AbstractFactory {
    public Button createButton();
    public Checkbox createCheckbox();
}
