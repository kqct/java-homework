import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        System.out.println("    *What's your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("    *Hello, " + name + "! How old are you?");
    }
}
