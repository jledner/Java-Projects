public class Dog extends Animal {
    // Instance variables
    private String breed;

    // Default Constructor
    public Dog() {
        super("Woof!", 0, "Unknown", "Unknown", 0);
        this.breed = "Unknown";
    }

    // Constructor
    public Dog(String sound, String breed, int age, String color, String name, int weight) {
        super(sound, age, color, name, weight);
        this.breed = breed;
    }

    // Method to make the dog bark
    @Override
    public void makeSound() {
        System.out.println(name + " barks " + sound);
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}