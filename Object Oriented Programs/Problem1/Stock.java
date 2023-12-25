public class Stock {
    String name;
    int num_of_shares;
    int share_price;

    public Stock(String name, int num_of_shares, int share_price) {
        this.name = name;
        this.num_of_shares = num_of_shares;
        this.share_price = share_price;
    }

    public int getTotalValue() {
        return this.num_of_shares * this.share_price;
    }
}
