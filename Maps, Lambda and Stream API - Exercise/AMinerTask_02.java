import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, Integer> words = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            int num = Integer.parseInt(scanner.nextLine());
            if (!words.containsKey(command)) {
                words.put(command, num);
            } else {
                int sum = num + words.get(command);
                words.put(command, sum);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
