import java.util.*;

public class DeckOfCards {
    static String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    static String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

    public String[][] shuffleCards() {
        String[][] shuffledCards = new String[52][2];
        int index = 0;
        for (int suit = 0; suit < suits.length; suit++) {
            for (int card = 0; card < cards.length; card++) {
                shuffledCards[index][0] = suits[suit];
                shuffledCards[index][1] = cards[card];
                index++;
            }
        }

        // shuffle the cards 100-200 times
        Random random = new Random();
        int shuffles = random.nextInt(100) + 100;
        for (int i = 0; i < shuffles; i++) {
            // we will swap any two random indices
            int a = random.nextInt(52);
            int b = random.nextInt(52);
            String[] temp = { shuffledCards[a][0], shuffledCards[a][1] };
            shuffledCards[a][0] = shuffledCards[b][0];
            shuffledCards[a][1] = shuffledCards[b][1];
            shuffledCards[b][0] = temp[0];
            shuffledCards[b][1] = temp[1];
        }
        return shuffledCards;
    }
}