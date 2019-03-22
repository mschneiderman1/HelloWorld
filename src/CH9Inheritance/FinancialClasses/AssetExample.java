package CH9Inheritance.FinancialClasses;

public class AssetExample{
    public static void main(String[] args){
        Asset[] myPortfolio = {new Stock("MSFT", 118.92),
                new Cash(500),
                new DividendStock("APPL", 196.51)};
        ((Stock)myPortfolio[0]).purchase(10, 90);
        ((DividendStock) myPortfolio[2]).purchase(12, 90);
        for(Asset s: myPortfolio){
            System.out.println("Market Value is " + s.getMarketValue());
            System.out.println("Profit is " + s.getProfit());
            System.out.println();
        }

    }
}
