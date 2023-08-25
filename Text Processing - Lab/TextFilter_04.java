import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (text.contains(word)){
                String newChar = "*".repeat(word.length());
                text = text.replace(word, newChar);
            }
        }
        System.out.println(text);
    }
}