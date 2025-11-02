package abstraction_example;

// Subclass 1
class Car extends Vehicle {
    private int doors;

    public Car(String model, int capacity, int doors) {
        super(model, capacity);
        this.doors = doors;
    }

    @Override
    public void move() {
        System.out.println("The car is moving on the road.");
    }

    @Override
    public void stop() {
        System.out.println("The car stopped at the traffic light.");
    }
}
