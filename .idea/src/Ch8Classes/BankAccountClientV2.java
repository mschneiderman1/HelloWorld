package Ch8Classes;

public class BankAccountClientV2 {
    public static void main(String[] args) {
        MattSchneidermanBankAccountV2 Matt = new MattSchneidermanBankAccountV2("Matt Schneiderman", "123456789",
                new Address(940, null, "Fairway Lane", "Mamaroneck", "NY", 10543),
                new DateOfBirth(11, 1, 2001));
        Matt.Deposit(1000000);
        System.out.println(Matt);
        Matt.Withdrawl(200);
        System.out.println(Matt);
    }
}
