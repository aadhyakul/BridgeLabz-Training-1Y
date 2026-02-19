import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();

        if (areAnagrams(s1, s2))
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams.");
        else
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are not anagrams.");
    }
}
