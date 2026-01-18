
import java.util.Scanner;
class BasicCalculatorLevel2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;

        System.out.println(
            "The addition, subtraction, multiplication, and division value of 2 numbers " +
            number1 + " and " + number2 + " is " +
            add + ", " + sub + ", " + mul + ", and " + div
        );
    }
}
