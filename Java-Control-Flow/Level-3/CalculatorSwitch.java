import java.util.Scanner;
public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Num1: "); double n1 = input.nextDouble();
        System.out.print("Num2: "); double n2 = input.nextDouble();
        System.out.print("Op (+,-,*,/): "); String op = input.next();
        switch(op) {
            case "+": System.out.println(n1 + n2); break;
            case "-": System.out.println(n1 - n2); break;
            case "*": System.out.println(n1 * n2); break;
            case "/": System.out.println(n2 != 0 ? n1 / n2 : "Error"); break;
            default: System.out.println("Invalid");
        }
    }
}
