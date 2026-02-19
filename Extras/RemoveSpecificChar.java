import java.util.Scanner;

public class RemoveSpecificChar {
    static String removeChar(String str, char ch) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch)
                result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("Modified String: \"" + removeChar(str, ch) + "\"");
    }
}
