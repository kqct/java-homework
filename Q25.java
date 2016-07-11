import java.util.Scanner;

public class Q25{
    public static void main(String[] args) {
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        System.out.print("Ok, " + name + ", how old are you? ");
        int age = keyboard.nextInt();
        if(age<16){
            System.out.println("You can't drive, " + name + ".");
        }else if(age<17){
            System.out.println("You can drive but not vote, " + name + ".");
        }else if(age<25){
            System.out.println("You can vote but not rent a car, " + name+ ".");
        }else{
            System.out.println("You can do pretty much anything, " + name+ ".");
        }
    }
}
