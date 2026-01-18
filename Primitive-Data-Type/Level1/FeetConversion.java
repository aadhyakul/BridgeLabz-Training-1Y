
import java.util.Scanner;
class FeetConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("Distance in yards is " + yards + " and in miles is " + miles);
    }
}
