package Ch8Classes;

public class BankAccountClientV1{
    public static void main(String[] args) {
        MattSchneidermanBankAccountV1 Matt = new MattSchneidermanBankAccountV1("Matt Schneiderman", "123456789",
                "940 Fairway Lane", "11012001");
        Matt.Deposit(1000000);
        System.out.println(Matt);
        Matt.Withdrawl(200);
        System.out.println(Matt);
    }
}
