import java.util.Scanner;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = scanner.nextInt();
        System.out.print("Enter cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] distribution = distributeCards(deck, players, cardsPerPlayer);
        printDistribution(distribution);
    }
    
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }
    
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards!");
            return new String[0][0];
        }
        
        String[][] distribution = new String[players][cardsPerPlayer];
        int cardIndex = 0;
        
        for (int player = 0; player < players; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                distribution[player][card] = deck[cardIndex++];
            }
        }
        return distribution;
    }
    
    public static void printDistribution(String[][] distribution) {
        for (int i = 0; i < distribution.length; i++) {
            System.out.println("Player " + (i+1) + ":");
            for (int j = 0; j < distribution[i].length; j++) {
                System.out.println("  " + distribution[i][j]);
            }
            System.out.println();
        }
    }
}