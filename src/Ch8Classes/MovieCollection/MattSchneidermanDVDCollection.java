package Ch8Classes.MovieCollection;

public class MattSchneidermanDVDCollection {
    private MattSchneidermanDVD[] list;
    private int count;
    private double totalCost;

    public MattSchneidermanDVDCollection(){
       list = new MattSchneidermanDVD[5];
       count = 0;
    }
    public void addDVD(MattSchneidermanDVD dvd){
        count++;
        if(count > list.length){
            increaseSize();
            list[count - 1] = dvd;
        }else{
            list[count - 1] = dvd;
        }
    }
    private void increaseSize(){
        MattSchneidermanDVD[] copy = list;
        list = new MattSchneidermanDVD[count];
        for(int i = 0; i < copy.length; i++){
            list[i] = copy[i];
        }
    }
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
