import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1 = Float.parseFloat(scanner.nextLine());
        float n2 = Float.parseFloat(scanner.nextLine());
        float n3 = Float.parseFloat(scanner.nextLine());
        float n4 = Float.parseFloat(scanner.nextLine());
        float sum = n1 + n2;
        float divide = sum/n3;
        float multiply = n4*divide;
        System.out.printf("%.0f",multiply);

    }
}
