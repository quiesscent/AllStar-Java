public class TrafficLight {
    private String color;
    private int duration;

    // Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor) {
        color = newColor;
        System.out.println("Traffic light color changed to: " + color);
    }

    // Method to check if the traffic light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the traffic light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public static void main(String[] args) {
        // Create a traffic light
        TrafficLight trafficLight = new TrafficLight("red", 60);

        // Check if the traffic light is red
        if (trafficLight.isRed()) {
            System.out.println("The traffic light is red.");
        } else {
            System.out.println("The traffic light is not red.");
        }

        // Check if the traffic light is green
        if (trafficLight.isGreen()) {
            System.out.println("The traffic light is green.");
        } else {
            System.out.println("The traffic light is not green.");
        }

        // Change the color of the traffic light
        trafficLight.changeColor("green");

        // Check again if the traffic light is red and green
        if (trafficLight.isRed()) {
            System.out.println("The traffic light is red.");
        } else {
            System.out.println("The traffic light is not red.");
        }

        if (trafficLight.isGreen()) {
            System.out.println("The traffic light is green.");
        } else {
            System.out.println("The traffic light is not green.");
        }
    }
}
