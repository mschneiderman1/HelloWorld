//This class represents a general asset that has a symbol and holds shares.
package CH9Inheritance.FinancialClasses;

public abstract class ShareAsset implements Asset {
    private String symbol;
    private double totalCost, currentPrice;

    //constuctor a new share asset with the given symbol and current price
    public ShareAsset(String symbol, double currentPrice){
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }
    //return the correct market value of this asset
    //the children of ShareAsset MUST implement the
    //getMarketValue() method, unless the child itself
    //is an abstract class.
    public abstract double getMarketValue();

    //returns the profit earned on shares of this asset
    public double getProfit(){
        return getMarketValue() - totalCost;
    }

    //returns the price per share of this asset
    public double getCurrentPrice(){
        return currentPrice;
    }
    //returns the total cost spent on all shares
    public double getTotalCost(){
        return totalCost;
    }
    //this returns the symbol of the share
    public String getSymbol(){
        return symbol;
    }

    //setter sets the current share price of this asset
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    //setter/adds a cost of the given amount to this assets
    public void addCost(double cost){
        totalCost += cost;
    }

}
