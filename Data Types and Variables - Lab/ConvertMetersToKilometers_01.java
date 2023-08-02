import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Integer.parseInt(scanner.nextLine());
        double meters = (double)n/1000;
        System.out.printf(String.format("%.2f", meters));

    }
}
