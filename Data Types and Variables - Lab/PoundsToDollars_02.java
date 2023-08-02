import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = Float.parseFloat(scanner.nextLine());
        float dollars = n*1.36f;
        System.out.printf("%.3f", dollars);

    }
}
