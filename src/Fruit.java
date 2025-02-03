//class for inheritence
//Item is superclass here and Fruit is its subclass that inherits the attributes and methods of Item
public class Fruit extends Item{
    private String type;

    public Fruit(String name, int quantity, String type) {
        super(name, quantity); // for attributes of super class to be inherited here
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Fruit: "+getName()+", Quantity: "+getQuantity()+", Type: "+type;
    }
}
