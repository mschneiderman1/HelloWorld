package Ch8Classes;

public class MattSchneidermanStockClient{
    public static void main(String[] args) {
        MattSchneidermanStock money = new MattSchneidermanStock("Googl", 10, 100.98, 0.0);
        System.out.println(money.toString());
        money.buy(12);
        System.out.println(money.toString());
    }

}
