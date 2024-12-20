package CollectionLab;

public class Item implements Comparable<Item> {

    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public int compareTo(Item o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return  this.id + " " + this.name + " " + this.price + " " + this.quantity;
    }
}
