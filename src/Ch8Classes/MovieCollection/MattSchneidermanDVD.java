package Ch8Classes.MovieCollection;

public class MattSchneidermanDVD{
    /**
     * provides all the basic info of a movie
     * title, director, year, cost and if its blueray
     */
    private String title;
    private String director;
    private int year;
    private double cost;
    private boolean blueray;

    /**
     *initlializes the dvd and set all the parameters to
     * their respective state field
     */

    public MattSchneidermanDVD(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    /**
     * returns the cost of the dvd
     */
    public double getCost(){
        return cost;
    }

    /**
     * overrides the toString method and returns all the dvd information
     * in the correct formation
     */
    public String toString(){
        String ifBlueray = "";
        if(blueray == true){
            ifBlueray = "Blu-Ray";
        }
        return "$" + cost + "\t" + year + "\t" + title + "  \t" + director + "\t" + ifBlueray;
    }
}
