package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Guri
 * @author Gurpartap Singh 6 Feb, 2024 
 */
package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Gurpartap Singh
 * @author Gurpartap Singh Feb 2024
 */
import java.util.Random;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            // Generate random value between 1 and 13 (inclusive) for card value
            int randomValue = new Random().nextInt(13) + 1;
            card.setValue(randomValue);
            
            // Generate random index between 0 and 3 (inclusive) for suit
            int randomSuitIndex = new Random().nextInt(Card.SUITS.length);
            card.setSuit(Card.SUITS[randomSuitIndex]);
            
            hand[i] = card;
        }

        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     */
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Gurpartap!");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Netflix");
        System.out.println("-- Coding");
	    System.out.println("-- PUBG");

        System.out.println();
        
    }

}
