package Ch8Classes;

public class MattSchneidermanStock {
    private String symbol;
    private int shares;
    private double costOfShare;
    private double totalValue;
    private double newCostOfStock;
    private double profit;

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
    public void sell(int shares){
        this.shares -= shares;
        totalValue -= (costOfShare * shares);
    }
    public void profit(){
        newCostOfStock = costOfShare * 1.045;
        profit = (newCostOfStock * shares) - (shares * costOfShare);
    }
    public String toString(){
        return "You own " + shares + " shares of " + symbol
                + " stock. One share cost $" + costOfShare + ". The total value of you paid for your stock is $" +
                totalValue + ". Your profit is $" + profit;
    }
}
