package designPatterns.structural.bridge;

/**
 * Implementation interface common for all concrete implementations, for eg. Radio, TV, etc.
 * An abstraction can only communicate with an implementation object via methods that are declared here.
 *
 * @author Simar Preet
 */
public interface Device {
    public boolean isEnabled();
    public void enable();
    public void disable();
    public int getVolume();
    public void setVolume(int volume);
    public int getChannel();
    public void setChannel(int channel);
    public void getStatus();
}
