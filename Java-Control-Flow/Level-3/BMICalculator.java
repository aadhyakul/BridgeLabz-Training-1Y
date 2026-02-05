import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Weight (kg): "); double w = input.nextDouble();
        System.out.print("Height (cm): "); double h = input.nextDouble() / 100;
        double bmi = w / (h * h);
        System.out.println("BMI: " + String.format("%.2f", bmi));
        if (bmi <= 18.4) System.out.println("Underweight");
        else if (bmi <= 24.9) System.out.println("Normal");
        else if (bmi <= 39.9) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
