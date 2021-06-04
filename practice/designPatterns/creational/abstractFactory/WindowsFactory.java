package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.button.Button;
import designPatterns.creational.abstractFactory.button.WindowsButton;
import designPatterns.creational.abstractFactory.checkbox.Checkbox;
import designPatterns.creational.abstractFactory.checkbox.WindowsCheckBox;

/**
 * @author Simar Preet
 */
public class WindowsFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckBox();
    }
}
