// This class represents a mutual fund purchase
package CH9Inheritance.FinancialClasses;

public class MutualFund extends ShareAsset{
    private double totalShares;

    //constructor a new mutual-fund with given symbol
    // and price per share
    public MutualFund(String symbol, double pricePerShare){
                super(symbol, pricePerShare);
                totalShares = 0.0;
    }

    //returns the market value of the shares
    public double getMarketValue(){
        return totalShares * getCurrentPrice();
    }
    //returns the total number of shares
    public double getTotalShares(){
        return totalShares;

    }
    //records a purchase of the given number rof stocks at the given price per share
    public void purchase(double shares, double pricePerShare){
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
