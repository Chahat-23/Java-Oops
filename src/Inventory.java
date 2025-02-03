import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items; //declaration of items arraylist
    public Inventory() {
        items = new ArrayList<>(); //assigning new empty arraylist to items arraylist
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addItem(String name, int quantity, String type) {
        items.add(new Fruit(name, quantity, type));
    }

    public void addItem(String name, int quantity, int days, String type) {
        items.add(new Weapon(name, quantity, days, type));
    }

    public void displayInventory() {
        for (Item item: items) {
            System.out.println("item: "+item.toString() );
        }
    }

    public void displayInventory(String type) {
        for (Item item: items) {
            if(item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString() );
            } else if(item instanceof Weapon &&((Weapon) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString() );
            }
        }
    }
}
