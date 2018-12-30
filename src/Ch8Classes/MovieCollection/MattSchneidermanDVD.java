package Ch8Classes.MovieCollection;

public class MattSchneidermanDVD{
    private String title;
    private String director;
    private int year;
    private double cost;
    private boolean blueray;

    public MattSchneidermanDVD(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    public double getCost(){
        return cost;
    }
    public String toString(){
        String ifBlueray = "";
        if(blueray == true){
            ifBlueray = "Blu-Ray";
        }
        return "$" + cost + "\t" + year + "\t" + title + " \t" + director + "\t" + ifBlueray;
    }
}
