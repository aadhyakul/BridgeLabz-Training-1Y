import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt(), sum = 0, temp = n;
        while (temp != 0) { sum += temp % 10; temp /= 10; }
        System.out.println(n + (n % sum == 0 ? " is Harshad" : " is not Harshad"));
    }
}
