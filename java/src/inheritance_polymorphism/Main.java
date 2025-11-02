package inheritance_polymorphism;

// Main class for testing
public class Main {
    public static void main(String[] args) {
        // Creating objects of different types
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Demonstrating polymorphism
        System.out.println("=== Polymorphism Example ===");
        genericAnimal.speak();
        dog.speak();
        cat.speak();

        // Demonstrating array of superclass type
        System.out.println("\n=== Array of Animals ===");
        Animal[] animals = {new Dog(), new Cat()};

        for (Animal a : animals) {
            a.speak();  // Each object executes its own version of speak()
        }
    }
}