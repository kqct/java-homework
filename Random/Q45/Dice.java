import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random r = new Random();

        int roll1 = r.nextInt(5)+1;
        int roll2 = r.nextInt(5)+1;

        System.out.println("HERE COME THE DICE!\n");
        System.out.println("Roll #1: " + roll1);
        System.out.println("Roll #2: " + roll2);
        System.out.println("The total is " + (roll1 + roll2) + "!");
    }
}
