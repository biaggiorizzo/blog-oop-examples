package abstraction_example;

// Subclass 2
class Airplane extends Vehicle {
    private int engines;

    public Airplane(String model, int capacity, int engines) {
        super(model, capacity);
        this.engines = engines;
    }

    @Override
    public void move() {
        System.out.println("The airplane is flying in the sky.");
    }

    @Override
    public void stop() {
        System.out.println("The airplane landed and stopped on the runway.");
    }
}