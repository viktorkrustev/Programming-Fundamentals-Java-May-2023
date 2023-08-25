import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String word1 = words[0];
        String word2 = words[1];
        
        int totalSum = sumOfChars(word1, word2);
        System.out.println(totalSum);
    }
    public static int sumOfChars(String word1, String word2){
        int longerWord = Math.max(word1.length(), word2.length());
        int smallerWord = Math.min(word1.length(), word2.length());
        int diff = longerWord - smallerWord;

        int sum = 0;

        for (int i = 0; i < smallerWord; i++) {
            char symbolW1 = word1.charAt(i);
            char symbolW2 = word2.charAt(i);
            sum += symbolW1 * symbolW2;
        }

        for (int i = longerWord - 1; i >= longerWord - diff; i--) {
            if (word1.length()>word2.length()){
                char symb = word1.charAt(i);
                sum+=symb;
            } else {
                char symb = word2.charAt(i);
                sum+=symb;
            }
        }
        return sum;
    }
}
