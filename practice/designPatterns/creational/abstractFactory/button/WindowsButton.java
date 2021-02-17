package designPatterns.creational.abstractFactory.button;

/**
 * @author Simar Preet
 */
public class WindowsButton implements Button {
    @Override
    public void createButton() {
        {

            System.out.println("new windows button created");
        }
    }
}
