import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        //start init
        Scanner keyboard = new Scanner(System.in);
        //end init

        System.out.print("Your name: ");
        String name = keyboard.nextLine();

        System.out.print("Your age: ");
        int age = keyboard.nextInt();

        if (age < 16) {
            System.out.println("\nYou can't drive, " + name + ".");
        }
        if (age >= 16 && age < 17) {
            System.out.println("\nYou can drive but not vote, " + name + ".");
        }
        if (age >= 17 && age < 25) {
            System.out.println("\nYou can vote but not rent a car, " + name + ".");
        }
        if (age >= 25) {
            System.out.println("\nYou can do pretty much anything, " + name + ".");
        }
    }
}
