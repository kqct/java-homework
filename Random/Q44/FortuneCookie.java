import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
        Random random = new Random();
        String[] cookieQuotes = {"A friend asks only for your time not your money.",
        "A good way to keep healthy is to eat more Chinese food.",
        "Your shoes will make you happy today.",
        "Change can hurt, but it leads a path to something better.",
        "Serious trouble will bypass you.",
        "You are very talented in many ways."};

        System.out.println("Fortune cookie says: " + cookieQuotes[1+random.nextInt(5)]);

    }
}
