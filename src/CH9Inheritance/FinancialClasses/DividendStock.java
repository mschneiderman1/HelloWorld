//this class represent a stock purchase that also pays dividends
package CH9Inheritance.FinancialClasses;

public class DividendStock extends Stock{
    private double dividends; //amount of dividends payed

    //constructor creates a new dividend stock with the given
    //the symbol and number of shares purchased
    public DividendStock(String symbol, double currentPrice){
        super(symbol, currentPrice);
        dividends = 0.0;
    }
    //returns the dividenedStock's market value which is
    //normal market stock value + any dividend
    public double getMarketValue(){
        return super.getMarketValue() + dividends;
    }
    //records a dividend of the given amount per share
    public void payDividend(double amountPerShare){
        dividends += amountPerShare * getTotalShares();
    }
}
