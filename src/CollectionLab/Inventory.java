package CollectionLab;

import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {

    HashMap<String, T> items ;
    RecentlyViewed< T > recentlyViewed;

    public Inventory() {
        items = new HashMap<>();
        recentlyViewed = new RecentlyViewed<>();
    }

    public void addItem(T Item) {
        if(items.containsKey(Item.getId())){
            System.out.println("Item with id "+Item.getId()+" already exists");
            return;
        }
        recentlyViewed.addRecentlyViewed(Item);
        items.put(Item.getId(), Item);

    }

    public void removeItem(String id) {
        if(!items.containsKey(id)){
            System.out.println("Item with id "+id+" does not exist");
            return;
        }
        items.remove(id);
    }

    public T getItem(String id) {
        if(!items.containsKey(id)){
            System.out.println("Item with id "+id+" does not exist");
            return null;
        }
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
