//represents financial assets that investors hold
package CH9Inheritance.FinancialClasses;

public interface Asset{
    //how much the asset is worth
    public double getMarketValue();
    //How much has been made on this asset
    public double getProfit();
}
