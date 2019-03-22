//represents an amount of money held by an investor
package CH9Inheritance.FinancialClasses;

public class Cash implements Asset{
    private double amount; //amount of money held

    //constructs a cash investments of thr given amount
    public Cash(double amount){
        this.amount = amount;
    }

    //returns this cash's market value investment, which is
    //equal to the amount of cash
    public double getMarketValue(){
        return amount;
    }

    //returns the cash markets value
    public double getProfit(){
        return 0.0;
    }
    //sets the amount of cash
    public void setAmount(double amount){
        this.amount = amount;
    }
}
