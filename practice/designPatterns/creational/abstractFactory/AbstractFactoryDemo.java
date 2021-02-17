package designPatterns.creational.abstractFactory;

/**
 * @author Simar Preet
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        String os = System.getProperty("os.name").toLowerCase();
        if(os.contains("mac")){
             new AbstractFactoryImpl(new MacOSFactory()).getFactory();
        }else{
            new AbstractFactoryImpl(new WindowsFactory()).getFactory();
        }

    }
}
