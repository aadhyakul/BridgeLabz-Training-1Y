import java.util.Scanner;

public class ReplaceWord {
    static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord))
                result.append(newWord);
            else
                result.append(words[i]);
            if (i < words.length - 1)
                result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("Enter new word: ");
        String newWord = sc.nextLine();
        System.out.println("Modified sentence: " + replaceWord(sentence, oldWord, newWord));
    }
}
