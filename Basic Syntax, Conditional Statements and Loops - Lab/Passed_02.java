import java.util.Scanner;

public class Passed_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = scanner.nextDouble();

        if (grade >= 3.00) {
            System.out.println("Passed!");
        }
    }
}
