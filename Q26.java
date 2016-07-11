import java.util.Scanner;

public class Q26{
    public static void main(String[] args) {
        System.out.print("Please enter your current Earth weight (lb): ");
        Scanner keyboard = new Scanner(System.in);
        double earthWeight = keyboard.nextDouble();
        System.out.println("\nI have information for the following planets: ");
        System.out.println("   1. Venus   2. Mars    3. Jupiter");
        System.out.println("   4. Saturn  5. Uranus  6. Neptune");
        System.out.print("\nWhich planet are you visiting? ");
        int planet = keyboard.nextInt();
        System.out.println("");
        double otherWeight = earthWeight;
        if(planet == 1){
            otherWeight = earthWeight * 0.78;
        }else if(planet == 2){
            otherWeight = earthWeight * 0.39;
        }else if(planet == 3){
            otherWeight = earthWeight * 2.65;
        }else if(planet == 4){
            otherWeight = earthWeight * 1.17;
        }else if(planet == 5){
            otherWeight = earthWeight * 1.05;
        }else if(planet == 6){
            otherWeight = earthWeight * 1.23;
        }
        System.out.println("Your weight would be " + otherWeight + " pounds on that planet.");
    }
}
