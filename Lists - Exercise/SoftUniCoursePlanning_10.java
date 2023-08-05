import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lessons = new ArrayList<>(Arrays.asList(scanner.nextLine().split(", ")));

        String input;
        while (!(input = scanner.nextLine()).equals("course start")) {
            String[] command = input.split(":");
            String action = command[0];
            String lesson = command[1];

            switch (action) {
                case "Add":
                    if (!lessons.contains(lesson)) {
                        lessons.add(lesson);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    if (!lessons.contains(lesson)) {
                        lessons.add(index, lesson);
                    }
                    break;
                case "Remove":
                    if (lessons.contains(lesson)) {
                        int lessonIndex = lessons.indexOf(lesson);
                        lessons.remove(lessonIndex);
                        if (lessons.size() > lessonIndex && lessons.get(lessonIndex).endsWith("-Exercise")) {
                            lessons.remove(lessonIndex);
                        }
                    }
                    break;
                case "Swap":
                    String lesson1 = command[1];
                    String lesson2 = command[2];
                    if (lessons.contains(lesson1) && lessons.contains(lesson2)) {
                        int index1 = lessons.indexOf(lesson1);
                        int index2 = lessons.indexOf(lesson2);
                        lessons.set(index1, lesson2);
                        lessons.set(index2, lesson1);

                        String exercise1 = lesson1 + "-Exercise";
                        String exercise2 = lesson2 + "-Exercise";
                        if (lessons.contains(exercise1)) {
                            int exerciseIndex1 = lessons.indexOf(exercise1);
                            lessons.remove(exerciseIndex1);
                            lessons.add(index2 + 1, exercise1);
                        }
                        if (lessons.contains(exercise2)) {
                            int exerciseIndex2 = lessons.indexOf(exercise2);
                            lessons.remove(exerciseIndex2);
                            lessons.add(index1 + 1, exercise2);
                        }
                    }
                    break;
                case "Exercise":
                    if (lessons.contains(lesson)) {
                        int indexLesson = lessons.indexOf(lesson);
                        String exercise = lesson + "-Exercise";
                        if (!lessons.contains(exercise)) {
                            lessons.add(indexLesson + 1, exercise);
                        }
                    } else {
                        lessons.add(lesson);
                        lessons.add(lesson + "-Exercise");
                    }
                    break;
            }
        }

        for (int i = 0; i < lessons.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, lessons.get(i));
        }
    }
}
