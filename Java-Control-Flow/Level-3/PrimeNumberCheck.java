import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        boolean p = n > 1;
        for (int i = 2; i < n; i++) if (n % i == 0) { p = false; break; }
        System.out.println(n + (p ? " is Prime" : " is not Prime"));
    }
}
