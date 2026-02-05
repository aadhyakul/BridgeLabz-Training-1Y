
import java.util.Scanner;
class SumOfNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) sumLoop += i;
            int sumFormula = n * (n + 1) / 2;
            System.out.println("Sum using loop = " + sumLoop);
            System.out.println("Sum using formula = " + sumFormula);
        } else {
            System.out.println("Not a natural number");
        }
        input.close();
    }
}
