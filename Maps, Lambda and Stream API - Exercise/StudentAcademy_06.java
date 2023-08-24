import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());

        Map<String, Double> studentsInfo = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsInfo.containsKey(name)){
                studentsInfo.put(name, grade);
            } else {
                double oldGrade = studentsInfo.get(name);
                double totalGrade = (oldGrade + grade)/2;
                studentsInfo.put(name, totalGrade);
            }
        }

        for (Map.Entry<String, Double> entry : studentsInfo.entrySet()) {
            if (entry.getValue()>=4.50){
                System.out.println(entry.getKey() + " -> " + String.format("%.2f",entry.getValue()));
            }
        }
    }
}