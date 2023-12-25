import java.util.*;

public class StockPortfolio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Stock> stocks = new ArrayList<>();
        System.out.print("Enter number of stocks: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Stock " + (i + 1));
            System.out.print("\tEnter Stock Name: ");
            String name = sc.nextLine();

            System.out.print("\tEnter Number of Shares: ");
            int num_of_shares = sc.nextInt();
            sc.nextLine();

            System.out.print("\tEnter Price of Share: ");
            int share_price = sc.nextInt();
            sc.nextLine();

            Stock stock = new Stock(name, num_of_shares, share_price);
            stocks.add(stock);
            System.out.println("Stock added....\n");
        }
        printPortfolio(stocks);
        sc.close();
    }

    public static void printPortfolio(ArrayList<Stock> stocks) {
        System.out.println("Your Portfolio is as below:\n");
        System.out.printf("%20s %20s %20s\n", "Stock Name", "Number of Shares", "Share Price");
        int totalValue = 0;
        for (int i = 0; i < stocks.size(); i++) {
            System.out.printf("%20s %20s %20s\n", stocks.get(i).name, stocks.get(i).num_of_shares,
                    stocks.get(i).share_price);
            totalValue += stocks.get(i).num_of_shares * stocks.get(i).share_price;
        }
        System.out.println("\nTotal Portfolio Value is: " + totalValue);
    }
}
