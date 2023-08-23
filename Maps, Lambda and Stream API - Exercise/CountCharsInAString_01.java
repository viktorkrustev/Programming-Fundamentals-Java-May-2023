import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Map<Character, Integer> countLetter = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == ' '){
                continue;
            }

            countLetter.putIfAbsent(symbol, 0);
            countLetter.put(symbol, countLetter.get(symbol) + 1);

        }
        for (Map.Entry<Character, Integer> entry : countLetter.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
