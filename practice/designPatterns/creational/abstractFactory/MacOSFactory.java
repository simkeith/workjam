package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.button.Button;
import designPatterns.creational.abstractFactory.checkbox.Checkbox;
import designPatterns.creational.abstractFactory.checkbox.MacOSCheckbox;
import designPatterns.creational.abstractFactory.button.MacOSButton;

/**
 * @author Simar Preet
 */
public class MacOSFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
