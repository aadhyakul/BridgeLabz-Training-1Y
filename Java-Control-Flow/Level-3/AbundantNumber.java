import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt(), sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        System.out.println(n + (sum > n ? " is Abundant" : " is not Abundant"));
    }
}
