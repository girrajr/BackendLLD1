package CollectionLab;

import java.util.LinkedList;

public class RecentlyViewed< T >{

    LinkedList< T > list;
    int maxSize;

    public RecentlyViewed() {
        this.maxSize = 10;
        list = new LinkedList<>();
    }

    public void addRecentlyViewed(T item) {
        if(list.size() == maxSize) {
            list.removeFirst();
        }
        list.add(item);
    }

}
