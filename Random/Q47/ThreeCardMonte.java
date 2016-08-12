import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int card = r.nextInt(3) + 1;


        System.out.print("You slide up to Fast Eddie's card table and plop down your cash."
        +  "\nHe glances at you out of the corner of his eye and starts shuffling."
        +  "\nHe lays down three cards."
        +  "\n\nWhich one is the ace?\n"
        +  "\n\t##  ##  ##"
        +  "\n\t##  ##  ##"
        +  "\n\t1   2   3"
        +  "\n\n> ");

        int guess = keyboard.nextInt();

        if (guess == card){
            System.out.println("\nYou nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
        } else {
            System.out.println("\nHa! Fast Eddie wins again! The ace was card number " + card + ".");
        }

        if (card == 1){
            System.out.println("\n\tAA  ##  ##"
                            +  "\n\tAA  ##  ##"
                            +  "\n\t1   2   3");
        } else if (card == 2){
            System.out.println("\n\t##  AA  ##"
                            +  "\n\t##  AA  ##"
                            +  "\n\t1   2   3");
        } else if (card == 3) {
            System.out.println("\n\t##  ##  AA"
                            +  "\n\t##  ##  AA"
                            +  "\n\t1   2   3");
        }
    }
}
