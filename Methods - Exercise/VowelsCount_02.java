import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = scanner.nextLine().split("");

        int res = vowelsCount(word);
        System.out.println(res);

    }

    public static int vowelsCount(String[] word){
        int count = 0;
        for (int i = 0; i < word.length ; i++) {
            if (word[i].equals("a") || word[i].equals("o") ||word[i].equals("u") ||word[i].equals("e") ||word[i].equals("i")||
                    word[i].equals("A") || word[i].equals("O") ||word[i].equals("U") ||word[i].equals("E") ||word[i].equals("I")) {
                count++;
            }
        }
        return count;
    }
}
