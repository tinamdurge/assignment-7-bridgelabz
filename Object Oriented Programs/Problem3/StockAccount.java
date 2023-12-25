import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class StockAccount {
    private HashMap<String, CompanyShares> companyShares = new HashMap<>();

    public void buy(int amount, String symbol) {
        if (this.companyShares.containsKey(symbol)) {
            CompanyShares share = companyShares.get(symbol);
            share.num_of_shares += amount;
            share.datetime = Instant.now();
        } else {
            this.companyShares.put(symbol, new CompanyShares(symbol, amount, Instant.now()));
        }
    }

    public void sell(int amount, String symbol) {
        if (this.companyShares.containsKey(symbol)) {
            CompanyShares share = companyShares.get(symbol);
            if (share.num_of_shares >= amount) {
                share.num_of_shares -= amount;
                share.datetime = Instant.now();
            } else {
                System.out.println("Not enough shares to sell.");
            }
        } else {
            System.out.println("Company does not have this shares.");
        }
    }

    public void printReport() {
        for (Map.Entry<String, CompanyShares> entry : companyShares.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().num_of_shares + " shares");
        }
    }

    // TODO: understand about filename uses and valueOf() function.
}