public class Animal {
    // Instance variables
    protected String sound;
    protected int age;
    protected String color;
    protected String name;
    protected int weight;

    // Default Constructor
    public Animal() {
        this.sound = "Unknown";
        this.age = 0;
        this.color = "Unknown";
        this.name = "Unknown";
        this.weight = 0;
    }

    // Constructor
    public Animal(String sound, int age, String color, String name, int weight) {
        this.sound = sound;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    // Getters and setters (optional, for accessing private fields)
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}
