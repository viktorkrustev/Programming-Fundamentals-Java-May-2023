import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> carParking = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            String name = command[1];
            if (command[0].equals("register")) {
                String id = command[2];

                if (!carParking.containsKey(name)) {
                    carParking.put(name, id);
                    System.out.printf("%s registered %s successfully%n", name, id);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", id);
                }

            } else {
                if (carParking.containsKey(name)) {
                    carParking.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                } else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }

            }

        }

        carParking.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}