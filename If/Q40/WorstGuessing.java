import java.util.Scanner;

public class WorstGuessing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rdmNbr = 4;

        System.out.print("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!" +
        "\n\nI\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");
        int guess = keyboard.nextInt();

        if (guess == rdmNbr) {
            System.out.println("\nLOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS 4!");
        } else {
            System.out.println("\nW00T!  U SUX0R!!!  I PWN J00!!!  IT WAS 4!");
        }

    }
}
