package abstraction_example;

// Main class for testing
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Sedan", 5, 4);
        Vehicle airplane = new Airplane("Boeing 737", 180, 2);

        car.showInfo();
        car.move();
        car.stop();

        System.out.println();

        airplane.showInfo();
        airplane.move();
        airplane.stop();
    }
}