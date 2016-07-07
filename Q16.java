import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        System.out.println("    *What's your name?");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();
        System.out.println("    *Hello, " + name + "! How old are you?");
        Scanner ageInput = new Scanner(System.in);
        String age = ageInput.nextLine();
        System.out.println("    *You're " + age + "? Congratulations!");
        System.out.println("    *How much do you make, " + name + "?");
        Scanner wageInput = new Scanner(System.in);
        String wage = ageInput.nextLine();
        System.out.println("    *"+wage+", huh? I hope that's in US dollars!");
    }
}
