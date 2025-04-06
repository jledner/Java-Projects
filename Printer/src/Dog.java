public class Dog extends Animal {
    private String breed;
    public Dog(String breed, String name, int age) {
        super(name, age);
        setBreed(breed);
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
}
