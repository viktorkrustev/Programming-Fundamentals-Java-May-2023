import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        printGrades(grade);


    }

    public static void printGrades(double grade){
        if (grade>=3 && grade<=3.49){
            System.out.println("Poor");
        } else if (grade>=3.50 && grade<=4.49) {
            System.out.println("Good");
        } else if (grade>=4.50 && grade<=5.49) {
            System.out.println("Very good");
        } else if (grade >= 5.50 && grade<=6) {
            System.out.println("Excellent");
        } else {
            System.out.println("Fail");
        }
    }
}
