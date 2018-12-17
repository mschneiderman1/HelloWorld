package Ch8Classes;

public class MattSchneidermanClientCodeHw1211{
    public static void main(String[] args){
        BankAccountV1 Matt = new BankAccountV1("Matt Schneiderman", 123456789, "940 Fairway Lane, " +
                "Mamaroneck NY, 10543",
                "11-01-01", 1276, 2000000.98;
        System.out.println(Matt.toString());

        MattSchneidermanInstagram Schneidz = new MattSchneidermanInstagram("Matt Schneiderman", "Password123",
                "MattIsAWESOME", "11-01-01", "JohnSmith@gmail.com");
        System.out.println(Schneidz.toString());

        MattSchneidermanBicycle TigerFire = new MattSchneidermanBicycle(589.95, false, "new",
                13, "orange" );
        System.out.println(TigerFire.toString()));

        MattSchneidemanPhone Pixel3 = new MattSchneidemanPhone("11:20", true, "MATT121",
                "9142176743", "Matt Schneiderman", false);
        System.out.println(Pixel3.toString());

        MattSchneidermanCar Ferari = new MattSchneidermanCar(5, "Red", 1999999.99, "Ferrari");
        System.out.println(Ferari.toString());

    }
}
