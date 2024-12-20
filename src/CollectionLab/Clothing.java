package CollectionLab;

public class Clothing extends Item{

    private int size;

    public Clothing(String id, String name, double price, int quantity, int size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}