public class MyAnimalList {
    private Animal [] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a){
        if (nextIndex < animals.length){
            animals[nextIndex] = a;
            System.out.println("Animal added at index " + nextIndex);
            nextIndex++;
        }
    }

    public void display(){
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.getName());
                animal.makeSound();
                if (animal instanceof Dog dog) {
                    System.out.println("Breed: " + dog.getBreed());
                }
            }
        }
    }
}