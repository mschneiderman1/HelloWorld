package Ch8Classes;

public class MattSchneidermanStock {
    private String symbol;
    private int shares;
    private double costOfShare;
    private double totalValue;

    //constructor
    public MattSchneidermanStock(String symbol, int shares,
        double costOfShare, double totalValue){
        this.symbol = symbol;
        this.shares = shares;
        this.costOfShare = costOfShare;
        this.totalValue = (costOfShare * shares);
    }

    //getters
    public String getSymbol(){
        return symbol;
    }
    public double getTotalCost(){
        return totalValue;
    }
    public int getShares(){
        return shares;
    }
    public void buy(int shares){
        this.shares += shares;
        totalValue += (costOfShare * shares);
    }
    public String toString(){
        return "You own " + shares + " shares of " + symbol
                + " stock. One share cost $" + costOfShare + ". The total value of your stock is $" +
                totalValue + ".";
    }
}
