import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What's your last name? ");
        String lastName = keyboard.nextLine();

        if (lastName.compareTo("Carswell") <= 0){
            System.out.println("You don't have to wait long, " + lastName + ".");
        }

        else if (lastName.compareTo("Carswell") > 0 && lastName.compareTo("Jones") <= 0) {
            System.out.println("That's not bad, " + lastName + ".");
        }

        else if (lastName.compareTo("Jones") > 0 && lastName.compareTo("Smith") <= 0) {
            System.out.println("Looks like a bit of a wait, " + lastName + ".");
        }

        else if (lastName.compareTo("Smith") > 0 && lastName.compareTo("Young") <= 0) {
            System.out.println("It's gonna be a while, " + lastName + ".");
        }

        else if (lastName.compareTo("Young") > 0){
            System.out.println("Not going anywhere for a while, " + lastName + "?");
        }
    }
}
