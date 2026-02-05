import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Physics: "); double p = input.nextDouble();
        System.out.print("Chemistry: "); double c = input.nextDouble();
        System.out.print("Maths: "); double m = input.nextDouble();
        double per = ((p + c + m) / 300.0) * 100;
        String g = "R";
        if (per >= 80) g = "A";
        else if (per >= 70) g = "B";
        else if (per >= 60) g = "C";
        else if (per >= 50) g = "D";
        else if (per >= 40) g = "E";
        System.out.println("Percentage: " + String.format("%.2f", per) + "%\nGrade: " + g);
    }
}
