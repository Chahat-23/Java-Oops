//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(); // creating Inventory object named inventory
        Item item = new Item("Generic Item", 30);
//        Fruit fruit = new Fruit("Apple", 20, "Fuji");
//        Weapon weapon = new Weapon("Sword", 2, 75, "Weapon1");
        inventory.addItem(item);
        inventory.addItem("Apple", 20, "Fuji");
        inventory.addItem("Sword", 2, 75, "Weapon1");
        inventory.displayInventory();
        inventory.displayInventory("Fuji");
        inventory.displayInventory("Weapon1");
    }
}