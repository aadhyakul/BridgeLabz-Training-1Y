import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt(), count = (n == 0) ? 1 : 0;
        while (n != 0) { n /= 10; count++; }
        System.out.println("Digits: " + count);
    }
}
