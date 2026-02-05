
import java.util.Scanner;
class SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("Is the first number the smallest? " + (a < b && a < c));
        input.close();
    }
}
