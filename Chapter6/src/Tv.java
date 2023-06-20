
public class Tv {
    // property
    String color;
    boolean power;
    int channel;

    //function
    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}
