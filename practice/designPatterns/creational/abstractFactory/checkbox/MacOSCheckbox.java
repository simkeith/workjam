package designPatterns.creational.abstractFactory.checkbox;

/**
 * @author Simar Preet
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void createCheckbox() {
        {
            System.out.println("new mac os checkbox created");
        }
    }
}
