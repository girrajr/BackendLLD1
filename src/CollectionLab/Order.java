package CollectionLab;

import java.util.PriorityQueue;

public class Order {

    private String id;
    private boolean isExpress;

    PriorityQueue<Order> items = new PriorityQueue<>( (o1, o2) -> {
        if(o1.isExpress && !o2.isExpress){
            return -1;
        }else if(!o1.isExpress && o2.isExpress){
            return 1;
        }else{
            if(o1.id.compareTo(o2.id) < 0) {
                return -1;
            }
        }
        return 0;
    });

    public Order(String id, boolean isExpress) {
        this.id = id;
        this.isExpress = isExpress;
    }

    public String getId() {
        return id;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void addOrder(Order order) {
        items.add(order);
    }

    public Order processOrder() {
        System.out.println("Order with id "+id+" is processed");
        return items.poll();
    }
}
