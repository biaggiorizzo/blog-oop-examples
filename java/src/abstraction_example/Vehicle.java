package abstraction_example;

// Abstract class (Base)
abstract class Vehicle {
    protected String model;
    protected int capacity;

    public Vehicle(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    // Abstract methods (must be implemented by subclasses)
    public abstract void move();
    public abstract void stop();

    // Concrete method (shared behavior)
    public void showInfo() {
        System.out.println("Model: " + model + ", Capacity: " + capacity);
    }
}