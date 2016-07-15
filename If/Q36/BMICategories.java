import java.util.Scanner;

public class BMICategories {
    public static void main(String[] args) {
        String bmiCat = "normal weight";
        System.out.print("Your height in m: ");
        Scanner keyboard = new Scanner(System.in);
        Float meterHeight = keyboard.nextFloat();
        System.out.print("Your weight in kg: ");
        Float kilogramWeight = keyboard.nextFloat();

        Float bmi = kilogramWeight/(meterHeight*meterHeight);

        if (bmi < 18.5) {
            bmiCat = "underweight";
        }
        if (bmi >=25.0 && bmi < 29.9) {
            bmiCat = "overweight";
        }
        if (bmi >= 30.0) {
            bmiCat = "obese";
        }

        System.out.println("Your BMI is " + bmi);
        System.out.println("BMI Category: " + bmiCat);
    }
}
