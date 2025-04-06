import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice() {
        return price;
    }

    public int compareTo(Book b){
        return title.compareTo(b.title);
    }
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price;
    }

}

class BookComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b2.getPrice() - b1.getPrice();
    }
}
