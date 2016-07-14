import java.util.Scanner;

public class Q32{
    public static void main(String[] args) {
        //start init
        String guess = "";
        Scanner keyboard = new Scanner(System.in);
        //end init

        System.out.println ("TWO QUESTIONS!"+
            "\nThink of an object, and I'll try to guess it.");
        System.out.print("\nQuestion 1) Is it an animal, vegetable, or mineral?"+
            "\n> ");
        String q1Answer = keyboard.nextLine();
        System.out.print("\nQuestion 2) Is it bigger than a breadbox?"+
            "\n> ");
        String q2Answer = keyboard.nextLine();

        if (q2Answer.equals("no")){
            if (q1Answer.equals("animal")){
                guess = "squirrel";
            } else if (q1Answer.equals("vegetable")){
                guess = "carrot";
            } else if (q1Answer.equals("mineral")){
                guess = "paper clip";
            }
        } else if (q2Answer.equals("yes")){
            if (q1Answer.equals("animal")){
                guess = "moose";
            } else if (q1Answer.equals("vegetable")){
                guess = "watermelon";
            } else if (q1Answer.equals("mineral")){
                guess = "Camaro";
            }
        }

        System.out.println("\nMy guess is that you're thinking of a " + guess +
            ".\nI would ask you if I'm right, but I don't actually care.");
    }
}
