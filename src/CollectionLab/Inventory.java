package CollectionLab;

import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {

    HashMap<String, T> items ;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addItem(T Item) {
        items.put(Item.getId(), Item);
    }

    public void removeItem(String id) {
        items.remove(id);
    }

    public T getItem(String id) {
        return items.get(id);
    }

   public List<T> getAllItems() {
        return (List<T>) items.values();
    }

    public void printInventory() {
        for (T item : items.values()) {
            System.out.println(item);
        }
    }

}
