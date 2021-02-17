package designPatterns.structural.bridge;

import designPatterns.structural.bridge.BasicRemote;

/**
 * Optional Class for enhanced capability
 *
 * @author Simar Preet
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        this.device = device;
    }

    public void mute() {
        device.setVolume(0);
    }

}
