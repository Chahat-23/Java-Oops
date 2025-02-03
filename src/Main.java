//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(); // creating Inventory object named inventory
        Item item = new Item("Generic Item", 30);
        Fruit fruit = new Fruit("Fuji", "Apple", 20);
        inventory.addItem(item);
        inventory.addItem(fruit);
        inventory.displayInventory();
    }
}