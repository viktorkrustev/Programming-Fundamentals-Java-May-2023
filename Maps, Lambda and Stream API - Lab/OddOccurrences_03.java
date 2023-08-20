import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        List<String> list = new ArrayList<>();
        Map<String, Integer> countWords = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String el = arr[i];
            arr[i] = el.toLowerCase();

            countWords.putIfAbsent(el,0);
            countWords.put(el, countWords.get(el) + 1);

        }
        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            if (entry.getValue() % 2 != 0){
                list.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", list));

    }
}
