package interface_example;

// "Automobile" is an interface that inherits from Transport
public interface Automobile extends Transport {
    void startEngine();
    void stopEngine();
    void refuel(String fuelType);
}
