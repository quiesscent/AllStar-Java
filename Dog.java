public class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter for name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Setter for breed attribute
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter for name attribute
    public String getName() {
        return name;
    }

    // Getter for breed attribute
    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        // Create two instances of Dog class
        Dog dog1 = new Dog("Max", "Labrador");
        Dog dog2 = new Dog("Buddy", "Golden Retriever");

        // Print initial values
        System.out.println("Initial values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        // Modify attributes using setter methods
        dog1.setName("Charlie");
        dog2.setBreed("German Shepherd");

        // Print updated values
        System.out.println("\nUpdated values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}