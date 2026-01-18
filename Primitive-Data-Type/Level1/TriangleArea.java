
import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of triangle is " + area);
    }
}
