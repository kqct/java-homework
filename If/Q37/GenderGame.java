import java.util.Scanner;

public class GenderGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your gender (M or F)? ");
        String gender = keyboard.nextLine();
        System.out.print("First name: ");
        String firstName = keyboard.nextLine();
        System.out.print("Last name: ");
        String lastName = keyboard.nextLine();
        System.out.print("Age: ");
        int age = keyboard.nextInt();

        if (age >= 20) {
            if (gender.equals("M"))
                firstName = "Mr.";

            if (gender.equals("F")) {
                System.out.print("\nAre you married, " + firstName + " (y/n)?");
                String married = keyboard.nextLine();
                if (married.equals("y")) {
                    firstName = "Mrs.";
                } else {
                    firstName = "Ms.";
                }
            }
        }

        System.out.println("\nThen I shall call you " + firstName + " " +
        lastName + ".");
    }
}
