import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Printer<Cat> catPrinter = new Printer<>(new Cat("black","Bill",7));
        catPrinter.print();

        Printer<Dog> dogPrinter = new Printer<>(new Dog("gray","Arlo",5));
        dogPrinter.print();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("black","bill",7));

        Cat myCat = cats.getFirst();

        shout("hello", "yo");
        shout(myCat.getName(), "what's up");
    }

    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        System.out.print(thingToShout + "!!!");
        System.out.println(otherThingToShout + "!!!");
    }
}