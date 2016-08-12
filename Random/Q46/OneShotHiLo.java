import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int random = r.nextInt(99) + 1;

        System.out.print("I'm thinking of a number between 1-100. Try to guess it." +
        ">");

        int input = keyboard.nextInt();

        if (input == random) {
            System.out.println("\nYou guessed it! What are the odds?!?");
        } else if (input > random) {
            System.out.println("\nSorry, you are too low. I was thinking of "+
            random);
        } else {
            System.out.println("\nSorry, you are too high. I was thinking of "+
            random);
        }
    }
}
