package Ch8Classes;

public class DOBandAddressClient{
    public static void main(String[] args){
        Address Matt = new Address(940, null, "Fairway Lane", "Mamaroneck",
                "NY", 10543);
        System.out.println(Matt.toString());

        DateOfBirth Matthew = new DateOfBirth(11, 01, 2001);
        System.out.println("\n" + Matthew.toString());
    }
}
