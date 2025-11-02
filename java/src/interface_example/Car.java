package interface_example;

public class Car implements Automobile {
    private String brand;
    private String model;
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void move() {
        System.out.println("The car is moving...");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped.");
    }

    @Override
    public void startEngine() {
        System.out.println("The car engine has started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The car engine has stopped.");
    }

    @Override
    public void refuel(String fuelType) {
        System.out.println("Refueling the car with " + fuelType + ".");
    }

    public void accelerate() {
        System.out.println("Accelerating the car!");
    }

    public void brake() {
        System.out.println("Braking the car!");
    }
}
