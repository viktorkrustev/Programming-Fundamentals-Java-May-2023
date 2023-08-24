import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("-");

        Map<String, Integer> namePointsMap = new LinkedHashMap<>();
        Map<String, Integer> languages = new LinkedHashMap<>();

        while(!command[0].contains("finished")){
            String username = command[0];
            String language = command[1];
            int points = 0;
            if (command.length>2){
                points = Integer.parseInt(command[2]);
            }

            if (!namePointsMap.containsKey(username)){
                namePointsMap.put(username, points);
            } else {
                if (points>namePointsMap.get(username)){
                    namePointsMap.put(username, points);
                }
            }

            if (command[1].equals("banned")){
                String nameToBan = command[0];
                namePointsMap.remove(nameToBan);
            }

            if (!languages.containsKey(language)){
                languages.put(language, 1);
            } else {
                languages.put(language, languages.get(language) + 1);

            }



            command = scanner.nextLine().split("-");
        }

        System.out.println("Results:");
        namePointsMap.forEach((k, v) -> System.out.println(k + " | " + v));
        System.out.println("Submissions:");
        languages.forEach((language, count) -> {
            if (!language.contains("banned")) {
                System.out.println(language + " - " + count);
            }
        });
    }
}