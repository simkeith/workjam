package designPatterns.structural.bridge;

/**
 * This is a concrete abstraction class that uses Device class for its implementation
 *
 * @author Simar Preet
 */
public class BasicRemote implements Remote {

    Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if (!device.isEnabled()) {
            device.enable();
        } else {
            device.disable();
        }
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 5);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 5);

    }

    @Override
    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }
}
