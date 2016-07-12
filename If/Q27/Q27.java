import java.util.Scanner;

public class Q27{
    public static void main(String[] args) {
        int numCorrect = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Are you ready for a quiz? ");
        keyboard.nextLine();
        System.out.println("Okay, here it comes!");
        System.out.println("\nQ1) What is the capital of Alaska?");
        System.out.print("	1) Melbourne" +
	                        "\n        2) Anchorage" +
	                        "\n        3) Juneau" +
                            "\n\n>");
        int q1Answer = keyboard.nextInt();
        if (q1Answer == 3){
            System.out.println("That's right!");
            numCorrect++;
        } else {
            System.out.println("Sorry, but the capital of Alaska is Juneau.");
        }
        System.out.println("\nQ2) Can you store the value \"cat\" in a variable of type int?");
        System.out.print("	1) yes" +
	                        "\n        2) no" +
                            "\n\n>");
        int q2Answer = keyboard.nextInt();
        if (q2Answer == 2){
            System.out.println("That's right!");
            numCorrect++;
        } else {
            System.out.println("Sorry, but \"cat\" is a string. ints can only store numbers.");
        }
        System.out.println("\nQ3) What is the result of 9+6/3?");
        System.out.print("	1) 5" +
	                        "\n        2) 11" +
                            "\n        3) 15/3" +
                            "\n\n>");
        int q3Answer = keyboard.nextInt();
        if (q3Answer == 2){
            System.out.println("That's right!");
            numCorrect++;
        } else {
            System.out.println("Sorry, but division comes before addition.");
        }
        System.out.println("\n\nOverall, you got " + numCorrect + " out of 3 correct." +
                           "\nThanks for playing!");
    }
}
