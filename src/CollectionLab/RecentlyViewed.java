package CollectionLab;

import java.util.LinkedList;
import java.util.List;

public class RecentlyViewed< T >{

    LinkedList< T > list;
    int maxSize;

    public RecentlyViewed() {
        this.maxSize = 3;
        list = new LinkedList<>();
    }

    public void addRecentlyViewed(T item) {

        // remove item if already present
        list.remove(item);

        // remove last item if list is full
        if(list.size() == maxSize) {
            list.removeLast();
        }

        // add item to the front of the list
        list.addFirst(item);
    }


    public List<T> getRecentlyViewed() {
        return List.copyOf(list);
    }

}
