package Ch8Classes.MovieCollection;

public class MattSchneidermanMovieCollectionClient {
    public static void main(String[] args){
        MattSchneidermanDVDCollection Matt = new MattSchneidermanDVDCollection();
        //adding dvds
        Matt.addDVD(new MattSchneidermanDVD("The Godfather", "Francis Ford Coppala", 1972,
                24.95, true));
        Matt.addDVD(new MattSchneidermanDVD("District 9", "Neill Bloomkamp", 2009,
                19.95, false));
        Matt.addDVD(new MattSchneidermanDVD("Iron Man", "Jon Favreau", 2008,
                15.95, false));
        Matt.addDVD(new MattSchneidermanDVD("All About Eve", "Joseph Mankiewicz", 1950,
                17.50, false));
        Matt.addDVD(new MattSchneidermanDVD("The Matrix", "Andy & Lana Wachowski", 1999,
                19.95, true));
        System.out.println(Matt);

        Matt.addDVD(new MattSchneidermanDVD("Iron Man 2", "Jon Favreau", 2010,
                22.99, false));
        Matt.addDVD(new MattSchneidermanDVD("Casablanca", "Michael Curtiz", 1942,
                19.95, false));
        System.out.println(Matt);
    }
}