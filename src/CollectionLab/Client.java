package CollectionLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Electronics electronics = new Electronics("1", "Laptop", 50000, 10, 2);
        Electronics electronics1 = new Electronics("2", "Mobile", 20000, 20, 1);
        Electronics electronics2 = new Electronics("3", "Tablet", 10000, 30, 1);
        Book book = new Book("4", "Java", 500, 10, "James Gosling");
        Book book1 = new Book("5", "Python", 400, 20, "Guido van Rossum");
        Book book2 = new Book("6", "C++", 300, 30, "Bjarne Stroustrup");
        Clothing clothing = new Clothing("7", "Shirt", 1000, 10, 40);
        Clothing clothing1 = new Clothing("8", "Trousers", 2000, 20, 42);

        List<Item> items = new ArrayList<>();
        items.add(electronics);
        items.add(electronics1);
        items.add(electronics2);
        items.add(book);
        items.add(book1);
        items.add(book2);
        items.add(clothing);
        items.add(clothing1);

        //sort
        Collections.sort(items);

        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
}
