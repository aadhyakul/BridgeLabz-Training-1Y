import java.util.Scanner;

public class MostFrequentChar {
    static char findMostFrequent(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray())
            freq[c]++;
        char maxChar = str.charAt(0);
        for (char c : str.toCharArray()) {
            if (freq[c] > freq[maxChar])
                maxChar = c;
        }
        return maxChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Most Frequent Character: '" + findMostFrequent(str) + "'");
    }
}
