package Ch8Classes.GroceryProject;

public class MattSchneidermanGroceryListClient{
    public static void main(String[] args){
        MattSchneidermanGroceryList myList = new MattSchneidermanGroceryList();
        myList.addItems(new MattSchneidermanGroceryItemOrder("Steak", 5, 10));
        myList.addItems(new MattSchneidermanGroceryItemOrder("Potatoes", 10, 2));
        System.out.println(myList);
    }
}
