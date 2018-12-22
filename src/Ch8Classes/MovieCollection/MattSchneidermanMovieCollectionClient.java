package Ch8Classes.MovieCollection;

public class MattSchneidermanMovieCollectionClient {
    public static void main(String[] args){
        MattSchneidermanDVDCollection Matt = new MattSchneidermanDVDCollection();
        MattSchneidermanDVD ironMan = new MattSchneidermanDVD("Iron Man", "Jon Favreau", 2008,
               24.95, false);
        System.out.println(ironMan.toString());
        MattSchneidermanDVD godfather = new MattSchneidermanDVD("The Godfather", "Francis", 1972,
                15.95, true);
        System.out.println(godfather.toString());

        Matt.addDVD(new MattSchneidermanDVD("Iron Man", "Jon Favreau", 2008,
                24.95, false));
        System.out.println(Matt);
        Matt.addDVD(new MattSchneidermanDVD("The Godfather", "Francis", 1972,
                15.95, true));
        System.out.println(Matt);
        Matt.addDVD(new MattSchneidermanDVD("The Godfather", "Francis", 1972,
                15.95, true));
        System.out.println(Matt);

    }
}