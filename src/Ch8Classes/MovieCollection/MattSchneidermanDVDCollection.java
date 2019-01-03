package Ch8Classes.MovieCollection;

public class MattSchneidermanDVDCollection{
        /**
        * These are the state fields
        * An array of the type MattSchneidermanDVD
        * a int for th number of movies
        * a double for the total value of the collection
        */
    private MattSchneidermanDVD[] list;
    private int count;
    private double totalCost;

    /**
     * Constructor
     *Initializes the array and gives it an initial length of 5
     * set count to 0
     */
    public MattSchneidermanDVDCollection(){
       list = new MattSchneidermanDVD[5];
       count = 0;
    }

    /**
     * increases the count by one
     * checks to see if there is room in the array
     * if not calls increaseSize()
     * adds a dvd to the collection at index (count - 1)
     */
    public void addDVD(MattSchneidermanDVD dvd){
        count++;
        if(count > list.length){
            increaseSize();
            list[count - 1] = dvd;
        }else{
            list[count - 1] = dvd;
        }
    }

    /**
     * creates a copy of the array
     * re-initializes MattSchneidermanDVD and makes it have a length of count
     * it then transfers the contents from the copy back to the list array
     */
    private void increaseSize(){
        MattSchneidermanDVD[] copy = list;
        list = new MattSchneidermanDVD[count];
        for(int i = 0; i < copy.length; i++){
            list[i] = copy[i];
        }
    }

    /**
     * finds the total cost of the collection
     * then creates one large string of the dvd list using the array
     * finally return all the info in the correction format
     */
    public String toString(){
        totalCost = 0.0;
        for(int i = 0; i < count; i++){
            totalCost += list[i].getCost();
        }
        String dvdList ="";
        for(int i = 0; i < count; i++){
            dvdList += list[i].toString() + "\n";

        }        double avergaeCost = totalCost / count;
        return "My DVD Collection\n\n" + "Number of DVDs: " + count +
                "\nTotal cost: $" + (((double)Math.round(totalCost  * 100)) / 100)  + "\nAverage Cost: $" +
                (((double)Math.round(avergaeCost * 100)) / 100) + "\n\n" + "DVD List: \n\n" + dvdList;
    }


}
