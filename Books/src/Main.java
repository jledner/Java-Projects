import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java", "smith", 123));
        books.add(new Book("Python", "jones", 222));
        books.add(new Book("JavaScript", "johnson" , 100));
        books.add(new Book("C", "jefferies", 9));
        books.add(new Book("C++", "bell", 81));
        System.out.println(books);

        Collections.sort(books);
        System.out.println(books);

        books.sort((b1, b2) -> b2.getPrice() - b1.getPrice());
        System.out.println(books);
    }
}