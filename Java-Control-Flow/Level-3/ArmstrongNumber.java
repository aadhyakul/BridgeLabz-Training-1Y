import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt(), sum = 0, temp = n;
        while (temp != 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        System.out.println(n + (sum == n ? " is Armstrong" : " is not Armstrong"));
    }
}
