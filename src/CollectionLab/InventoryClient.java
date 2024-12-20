package CollectionLab;

public class InventoryClient {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem(new Book("1", "Book1", 100, 10, "Author1"));
        inventory.addItem(new Book("2", "Book2", 200, 20, "Author2"));
        inventory.addItem(new Electronics("3", "Electronics1", 300, 30, 1));
        inventory.addItem(new Electronics("2", "Electronics2", 400, 40, 2));

        inventory.printInventory();

        System.out.println(inventory.getItem("1"));
        System.out.println(inventory.getItem("2"));

        inventory.removeItem("1");
        inventory.printInventory();

        inventory.removeItem("2");
        inventory.printInventory();
    }
}
