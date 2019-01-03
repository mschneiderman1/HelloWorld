package Ch8Classes.GroceryProject;

public class MattSchneidermanGroceryListClient{
    public static void main(String[] args){
        MattSchneidermanGroceryList myList = new MattSchneidermanGroceryList();
        myList.addItems(new MattSchneidermanGroceryItemOrder("Steak", 5, 10));
        myList.addItems(new MattSchneidermanGroceryItemOrder("Potatoes", 10, 2));
        myList.addItems(new MattSchneidermanGroceryItemOrder("Pineapple", 2,  5));
        myList.addItems(new MattSchneidermanGroceryItemOrder("Chocolate Bars", 6, 2));
        myList.addItems(new MattSchneidermanGroceryItemOrder("Iced Tea", 2, 5));
        System.out.println(myList);
    }
}
