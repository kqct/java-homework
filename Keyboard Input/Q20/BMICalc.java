import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        System.out.print("Your height in m: ");
        Scanner keyboard = new Scanner(System.in);
        Float meterHeight = keyboard.nextFloat();
        System.out.print("Your weight in kg: ");
        Float kilogramWeight = keyboard.nextFloat();

        Float bmi = kilogramWeight/(meterHeight*meterHeight);
        System.out.println("Your BMI is " + bmi);
    }
}
