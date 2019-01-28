package Ch8Classes.GroceryProject;

import Ch8Classes.MattSchneidermanBankAccountV2;

public class MattSchneidermanGroceryList{
    public static final int MAX_ITEMS = 10;
    //state fields
    private MattSchneidermanGroceryItemOrder[] list;
    private int numItems;

    //constructor
    public MattSchneidermanGroceryList(){
        list = new MattSchneidermanGroceryItemOrder[MAX_ITEMS];
        numItems = 0;
    }
    public void addItems(MattSchneidermanGroceryItemOrder item){
        list[numItems] = item;
        numItems++;
    }
    public double getTotalCost(){
        double totalCost = 0;
        for(int i = 0; i < numItems; i++){
            totalCost += list[i].getCost();
        }
        return totalCost;
    }
    public String toString(){
        String myList = "My Grocery List: \n";
        for(int i = 0; i < numItems; i++){
            myList +=  "Item : " + (i + 1) + "\t" + list[i].toString();
        }
        double totalCost = 0.0;
        for(int i = 0; i < numItems; i++){
            totalCost += list[i].getCost();
        }
        myList += "\nTotal Cost: $" + totalCost + "0";
        return myList;
        //ADD: total cost of everything that is in the basket
    }
}
