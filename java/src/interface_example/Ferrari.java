package interface_example;

public class Ferrari extends Car {
    private String version;
    private boolean hasAutopilot;

    public Ferrari(String model, String version, boolean hasAutopilot) {
        super("Ferrari", model, 2);
        this.version = version;
        this.hasAutopilot = hasAutopilot;
    }

    public void activateAutopilot() {
        if (hasAutopilot) {
            System.out.println("Autopilot activated in Ferrari " + version + "!");
        } else {
            System.out.println("This Ferrari does not have autopilot.");
        }
    }
}
