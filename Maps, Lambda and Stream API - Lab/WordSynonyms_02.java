import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!words.containsKey(word)){
                List<String> list = new ArrayList<>();
                list.add(synonym);
                words.put(word, list);
            } else {
                words.get(word).add(synonym);
            }

        }
        words.forEach((k, v) -> System.out.println(k + " - " + String.join(", ", v)));
    }
}
