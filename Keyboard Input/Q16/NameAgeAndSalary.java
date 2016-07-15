import java.util.Scanner;

public class NameAgeAndSalary {
    public static void main(String[] args) {
        System.out.println("    *What's your name?");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        System.out.println("    *Hello, " + name + "! How old are you?");
        String age = keyboard.nextLine();
        System.out.println("    *You're " + age + "? Congratulations!");
        System.out.println("    *How much do you make, " + name + "?");
        String wage = keyboard.nextLine();
        System.out.println("    *"+wage+", huh? I hope that's in US dollars!");
    }
}
