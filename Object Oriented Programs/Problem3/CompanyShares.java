import java.time.Instant;

public class CompanyShares {
    String symbol;
    int num_of_shares;
    Instant datetime;

    public CompanyShares(String symbol, int num_of_shares, Instant datetime) {
        this.symbol = symbol;
        this.num_of_shares = num_of_shares;
        this.datetime = datetime;
    }
}
