import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int rdmNbr = 1 + random.nextInt(10);

        System.out.print("I'm thinking of a number from 1 to 10." +
        "\nYour guess: ");
        int guess = keyboard.nextInt();

        if (guess != rdmNbr) {
            System.out.println("\nSorry, but I was really thinking of " +
            rdmNbr + ".");
        } else {
            System.out.println("\nThat's right! My secret number was " +
            rdmNbr + "!");
        }

    }
}
