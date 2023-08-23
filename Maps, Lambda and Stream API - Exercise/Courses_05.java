import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(" : ");

        Map<String, ArrayList<String>> courses = new LinkedHashMap<>();

        while (!command[0].equals("end")){
            String courseName = command[0];
            String studentName = command[1];
            if (!courses.containsKey(courseName)){
                courses.put(courseName, new ArrayList<>());
                courses.get(courseName).add(studentName);
            } else {
                courses.get(courseName).add(studentName);
            }


            command = scanner.nextLine().split(" : ");
        }

        for (Map.Entry<String, ArrayList<String>> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach((v) -> System.out.println("-- " + v));
        }

    }
}
