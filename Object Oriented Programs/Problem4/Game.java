public class Game {
    public static void main(String[] args) {

        // creating a new deck of cards and shuffling it
        DeckOfCards deck = new DeckOfCards();
        String[][] shuffledCards = deck.shuffleCards();

        // creating 4 players with 9 cards each for the game
        Player[] players = { new Player(9), new Player(9), new Player(9), new Player(9) };

        // distributing cards to players
        int card_index = 0;
        for (int i = 0; i < players.length; i++) {
            Player p = players[i];
            for (int j = 0; j < 9; j++) {
                p.cards[j][0] = shuffledCards[card_index][0];
                p.cards[j][1] = shuffledCards[card_index][1];
                card_index++;
            }
            System.out.println("\nCards of player " + (i + 1) + " are:");
            p.printCards();
        }
    }
}
