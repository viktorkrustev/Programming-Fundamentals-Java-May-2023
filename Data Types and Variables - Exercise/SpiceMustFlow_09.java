import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());

        int totalSpice = 0;
        int days = 0;

        while (startingYield >= 100) {
            totalSpice += startingYield;

            if (totalSpice >= 26) {
                totalSpice -= 26;
            } else {
                totalSpice = 0;
            }

            startingYield -= 10;
            days++;
        }

        if (totalSpice >= 26) {
            totalSpice -= 26;
        } else {
            totalSpice = 0;
        }

        System.out.println(days);
        System.out.println(totalSpice);
    }
}
