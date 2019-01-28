//This program simulates a grocery item
//This will be a part of a grocery program
//This will include name, quantity and PricePerUnit
package Ch8Classes.GroceryProject;

public class MattSchneidermanGroceryItemOrder{
    //state fields
    private String name;
    private int quantity;
    private double ppu;

    //constructor

    public MattSchneidermanGroceryItemOrder(String name, int quantity, double ppu) {
        this.name = name;
        this.quantity = quantity;
        this.ppu = ppu;
    }
    //behaviors
    public double getCost(){
        return (ppu * quantity);
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public String toString(){
        return "Name: " + name +"\tQuantity: " + quantity +
                "\tPricePerUnit: $" + ppu + "0\tTotal Cost: $"
                + getCost() + "0\n";
    }
}
