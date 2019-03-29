package Ch8Classes.MattSchneidermanProject6MovieCollection;

import java.util.ArrayList;

public class MattSchneidermanDVDCollection{
        /**
        * These are the state fields
        * An array of the type MattSchneidermanDVD
        * a int for th number of movies
        * a double for the total value of the collection
        */
    private ArrayList<MattSchneidermanDVD> list = new ArrayList<MattSchneidermanDVD>();
    private double totalCost;

   /*
     * Constructor
     *Initializes the array and gives it an initial length of 5
     * set count to 0
     public MattSchneidermanDVDCollection(MattSchneidermanDVD dvd){
       list.add(dvd);
    }*/

    /**
     * increases the count by one
     * checks to see if there is room in the array
     * if not calls increaseSize()
     * adds a dvd to the collection at index (count - 1)
     */
    public void addDVD(MattSchneidermanDVD dvd){
        list.add(dvd);
    }

    /**
     * finds the total cost of the collection
     * then creates one large string of the dvd list using the array
     * finally return all the info in the correction format
     */
    public String toString(){
        totalCost = 0.0;
        for(int i = 0; i < list.size(); i++){
            totalCost += list.get(i).getCost();
        }
        String dvdList ="";
        for(int i = 0; i < list.size(); i++){
            dvdList += list.get(i).toString() + "\n";

        }        double avergaeCost = totalCost / list.size();
        return "My DVD Collection\n\n" + "Number of DVDs: " + list.size() +
                "\nTotal cost: $" + (((double)Math.round(totalCost  * 100)) / 100)  + "\nAverage Cost: $" +
                (((double)Math.round(avergaeCost * 100)) / 100) + "\n\n" + "DVD List: \n\n" + dvdList;
    }


}
