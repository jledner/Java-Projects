public class AnimalTestDrive
{
    public static void main (String[] args){
        MyAnimalList list = new MyAnimalList();
        Dog dog = new Dog("Woof!", "Labrador", 3, "Black", "Buddy", 30);
        dog.makeSound(); // Output: Buddy says: Woof!
        list.add(dog);
        list.display();
    }
}
