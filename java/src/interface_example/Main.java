package interface_example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        Motorcycle motorcycle = new Motorcycle("Honda", "CB500", 500);
        Ferrari ferrari = new Ferrari("F8 Tributo", "Spider", true);

        car.startEngine();
        car.accelerate();
        car.stop();

        System.out.println();

        motorcycle.startEngine();
        motorcycle.move();
        motorcycle.stop();

        System.out.println();

        ferrari.startEngine();
        ferrari.activateAutopilot();
    }
}
