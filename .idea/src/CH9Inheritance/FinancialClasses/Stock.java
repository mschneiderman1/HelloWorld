package CH9Inheritance.FinancialClasses;

public class Stock extends ShareAsset {
    private int totalShares;

    //constructs a new Stock with the given symbol and currentPrice
    public Stock(String symbol, double currentPrice){
        super(symbol, currentPrice);
        this.totalShares =0 ;
    }

    //returns the current market value of this stock which is equl to the number of shares times the currentPrice
    @Override
    public double getMarketValue(){
        return totalShares * getCurrentPrice();
    }

    //getter to view the shares, returns the total number of shares
    public int getTotalShares(){
        return totalShares;
    }

    //records a purchase of the given number rof stocks at the given price per share
    public void purchase(int shares, double pricePerShare){
        totalShares += shares;
        addCost(shares * pricePerShare);
    }

}
