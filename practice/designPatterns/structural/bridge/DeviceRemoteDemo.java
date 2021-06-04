package designPatterns.structural.bridge;

/**
 * Demo class
 * @author Simar Preet
 */
public class DeviceRemoteDemo {

    public static void main(String[] args) {
        Device d1 = new TV();
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(d1);
        basicRemote.power();
        d1.getStatus();

        Device d2 = new Radio();
        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(d2);
        advancedRemote.power();
        advancedRemote.mute();
        d2.getStatus();

    }
}
