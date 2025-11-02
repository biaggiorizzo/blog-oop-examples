package interface_example;

public class Motorcycle implements Automobile {
    private String brand;
    private String model;
    private int engineCapacity;

    public Motorcycle(String brand, String model, int engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void move() {
        System.out.println("The motorcycle is moving...");
    }

    @Override
    public void stop() {
        System.out.println("The motorcycle has stopped.");
    }

    @Override
    public void startEngine() {
        System.out.println("The motorcycle engine has started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The motorcycle engine has stopped.");
    }

    @Override
    public void refuel(String fuelType) {
        System.out.println("Refueling the motorcycle with " + fuelType + ".");
    }

    public void accelerate() {
        System.out.println("Accelerating the motorcycle!");
    }

    public void brake() {
        System.out.println("Braking the motorcycle!");
    }
}
