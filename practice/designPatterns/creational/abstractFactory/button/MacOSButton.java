package designPatterns.creational.abstractFactory.button;

/**
 * @author Simar Preet
 */
public class MacOSButton implements Button {

    @Override
    public void createButton() {
        {
            System.out.println("new mac os button created");
        }
    }
}
