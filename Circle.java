public class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius attribute
    public double getRadius() {
        return radius;
    }

    // Setter for radius attribute
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create an instance of Circle class
        Circle circle = new Circle(4.0);

        // Print initial radius
        System.out.println("Initial radius of the circle: " + circle.getRadius());

        // Modify radius
        circle.setRadius(6.0);

        // Print updated radius
        System.out.println("Updated radius of the circle: " + circle.getRadius());

        // Calculate and print area and circumference
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Circumference of the circle: " + circle.calculateCircumference());
    }
}
