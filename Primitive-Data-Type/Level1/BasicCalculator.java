
import java.util.Scanner;
class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        System.out.println(
            "Addition: " + (number1 + number2) +
            "\nSubtraction: " + (number1 - number2) +
            "\nMultiplication: " + (number1 * number2) +
            "\nDivision: " + (number1 / number2)
        );
    }
}
