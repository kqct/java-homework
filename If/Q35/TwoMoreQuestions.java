import java.util.Scanner;

public class TwoMoreQuestions {
    public static void main(String[] args) {
        //<init>
        Scanner keyboard = new Scanner(System.in);
        String guess = "ERROR";
        //</init>

        System.out.println("TWO MORE QUESTIONS, BABY!\n" +
        "Think of something and I'll try to guess it!\n");

        System.out.print("Question 1) Does it stay inside, outside, or both? ");
        String q1 = keyboard.nextLine();

        System.out.print("Question 2) Is it a living thing? ");
        String q2 = keyboard.nextLine();

        if (q1.equals("inside") && q2.equals("yes")) {
            guess = "houseplant";
        }
        if (q1.equals("inside") && q2.equals("no")) {
            guess = "shower curtain";
        }

        if (q1.equals("outside") && q2.equals("yes")) {
            guess = "bison";
        }
        if (q1.equals("outside") && q2.equals("no")) {
            guess = "billboard";
        }

        if (q1.equals("both") && q2.equals("yes")) {
            guess = "dog";
        }
        if (q1.equals("both") && q2.equals("no")) {
            guess = "cell phone";
        }

        System.out.println("\nThen what else could you be thinking of besides a "
        + guess + "?");
    }
}
