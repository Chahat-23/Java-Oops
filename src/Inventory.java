import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items; //declaration of items arraylist
    public Inventory() {
        items = new ArrayList<>(); //assigning new empty arraylist to items arraylist
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayInventory() {
        for (Item item: items) {
            System.out.println("item: "+item.getName() + ", Quantity: " + item.getQuantity() );
        }
    }
}
