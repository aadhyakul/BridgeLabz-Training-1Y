
import java.util.Scanner;
class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;
        int i = 0;

        while (i < power) {
            result *= number;
            i++;
        }
        System.out.println("Result = " + result);
        input.close();
    }
}
