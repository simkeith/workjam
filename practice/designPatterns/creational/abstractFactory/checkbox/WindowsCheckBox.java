package designPatterns.creational.abstractFactory.checkbox;

/**
 * @author Simar Preet
 */
public class WindowsCheckBox implements Checkbox {

    @Override
    public void createCheckbox(){
        {

            System.out.println("new windows checkbox created");
        }
    }
}
