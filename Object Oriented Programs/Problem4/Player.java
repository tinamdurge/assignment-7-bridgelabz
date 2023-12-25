public class Player {
    int num_of_cards;
    String[][] cards;

    public Player(int num_of_cards) {
        this.num_of_cards = num_of_cards;
        this.cards = new String[num_of_cards][2];
    }

    public void printCards() {
        for (int i = 0; i < this.num_of_cards; i++) {
            System.out.println("--> " + this.cards[i][1] + " of " + this.cards[i][0]);
        }
    }
}
