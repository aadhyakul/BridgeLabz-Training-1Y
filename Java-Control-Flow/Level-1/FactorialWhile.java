
import java.util.Scanner;
class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            int fact = 1, i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial = " + fact);
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
