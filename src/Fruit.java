//class for inheritence
//Item is superclass here and Fruit is its subclass that inherits the attributes and methods of Item
public class Fruit implements ItemStuff{
    private int quantity;
    private String name;
    private String type;

    public Fruit(String name, int quantity, String type) {
        this.name = name;
        this.quantity = quantity;// for attributes of super class to be inherited here
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void getInfo() {
        System.out.println("Fruit: "+getName()+", Quantity: "+getQuantity()+", Type: "+type);
    }
}
