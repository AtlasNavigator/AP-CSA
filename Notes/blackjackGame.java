import java.util.Scanner;
/**
 * This is the blackjack game.
 *
 * @author Jose Prieto
 * @version 09152022
 */
public class blackjackGame
{   
    private static boolean winCheck(int total){
        if (total == 21){
            System.out.println("");
            System.out.println("Congratulations, you won! You got 21.");
            return true;
        } else {
            return false;
        }
    }

    public static void game(){ //This is the game's method
        Scanner scanner = new Scanner(System.in);

        /**
         * Helps differentiate between the player and dealer's hands.
         */
        hand player = new hand();  //Player's hand
        hand dealer  = new hand(); //Dealer's hand

        System.out.println("#################  WELCOME TO BLACKJACK!  #################");
        //Game welcome message

        /**
         * Player initial hand
         */

        System.out.println("");
        System.out.println("-------- PLAYER --------"); //Player hand
        System.out.println("Card 1: " + player.card1Value()); //Print card 1 for player
        System.out.println("Card 2: " + player.card2Value()); //Print card 2 for player
        System.out.println("Total: " + player.getTotal()); //Print player total

        /**
         * Dealer's hand from POV of player
         */

        System.out.println("");
        System.out.println("-------- DEALER --------"); //Dealer's initial card
        System.out.println("Card 1: " + dealer.card1Value()); //Print dealer's 1st card
        System.out.println("Card 2: Undefined"); //Do not reveal card 2

        //Begin the actual game

        boolean playGame = true; //Is the game playing
        while (playGame){
            System.out.println("What would you like to do?");
            System.out.println("1. Hit");
            System.out.println("2. Stand");
            int response = scanner.nextInt();

            if (response == 1){
                player.hit(); //Executes the hit command
                if (winCheck(player.getTotal())){
                    break;
                } else if (player.bustCheck()){
                    System.out.println("The player has bust.");
                    break;
                } else {
                    System.out.println("Your total currently is: " + player.getTotal());
                    if (dealer.getTotal() < 17){
                        System.out.println("");
                        System.out.println("The dealer will hit.");
                        System.out.println("");
                        dealer.hit();
                        if (dealer.bustCheck()){
                            System.out.println("The dealer has bust.");
                            break;
                        }
                        //If dealer total < 17, hit
                        if (player.getTotal() > dealer.getTotal()){
                            System.out.println("Congrats, you won!");
                            System.out.println("Here are the numbers:");
                            System.out.println("Player: " + player.getTotal());
                            System.out.println("Dealer: " + dealer.getTotal());
                            break;
                        } else {
                            System.out.println("The house wins.");
                            System.out.println("Here are the numbers:");
                            System.out.println("Player: " + player.getTotal());
                            System.out.println("Dealer: " + dealer.getTotal());
                            break;
                        }                       
                    } else {
                        System.out.println("The dealer will stand.");
                        System.out.println("");

                        if (player.getTotal() > dealer.getTotal()){
                            System.out.println("Congrats, you won!");
                            System.out.println("Here are the numbers:");
                            System.out.println("Player: " + player.getTotal());
                            System.out.println("Dealer: " + dealer.getTotal());
                            break;
                        } else {
                            System.out.println("The house wins.");
                            System.out.println("Here are the numbers:");
                            System.out.println("Player: " + player.getTotal());
                            System.out.println("Dealer: " + dealer.getTotal());
                            break;
                        }   
                    }
                } 
            } else if (response == 2){
                if (dealer.getTotal() < 17){
                    System.out.println("The dealer will hit.");
                    System.out.println("");
                    dealer.hit();
                    if (dealer.bustCheck()){
                        System.out.println("The dealer has bust.");
                        break;
                    }
                    if (player.getTotal() > dealer.getTotal()){
                        System.out.println("Congrats, you won!");
                        System.out.println("Here are the numbers:");
                        System.out.println("Player: " + player.getTotal());
                        System.out.println("Dealer: " + dealer.getTotal());
                        break;
                    } else {
                        System.out.println("The house wins.");
                        System.out.println("Here are the numbers:");
                        System.out.println("Player: " + player.getTotal());
                        System.out.println("Dealer: " + dealer.getTotal());
                        break;
                    }   
                }  else {
                    System.out.println("The dealer will stand.");
                    System.out.println("");

                    if (player.getTotal() > dealer.getTotal()){
                        System.out.println("Congrats, you won!");
                        System.out.println("Here are the numbers:");
                        System.out.println("Player: " + player.getTotal());
                        System.out.println("Dealer: " + dealer.getTotal());
                        break;
                    } else {
                        System.out.println("The house wins.");
                        System.out.println("Here are the numbers:");
                        System.out.println("Player: " + player.getTotal());
                        System.out.println("Dealer: " + dealer.getTotal());
                        break;
                    }   
                }
            }
        }
    }
}
