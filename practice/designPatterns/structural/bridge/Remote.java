package designPatterns.structural.bridge;

/**
 * The Abstraction provides high-level control logic. It relies on the implementation object (Device) to do the actual low-level work.
 *
 * @author Simar Preet
 */
public interface Remote {
    public void power();

    public void volumeUp();

    public void volumeDown();

    public void channelUp();

    public void channelDown();
}
