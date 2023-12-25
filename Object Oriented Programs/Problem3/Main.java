public class Main {
    public static void main(String[] args) {

        // creating a stock account
        StockAccount stockAccount = new StockAccount();

        // buying some company shares
        stockAccount.buy(50, "MRF");
        stockAccount.buy(200, "Puma");
        stockAccount.buy(125, "HCL");

        stockAccount.printReport();

        // selling some shares
        stockAccount.sell(30, "Adidas");
        stockAccount.sell(150, "MRF");
        stockAccount.sell(25, "HCL");

        stockAccount.printReport();
    }
}
