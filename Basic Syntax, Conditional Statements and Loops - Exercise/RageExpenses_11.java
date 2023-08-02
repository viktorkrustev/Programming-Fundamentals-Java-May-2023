import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashedHeadsets = lostGames / 2;
        int trashedMouses = lostGames / 3;
        int trashedKeyboards = lostGames / 6;
        int trashedDisplays = trashedKeyboards / 2;

        double totalExpenses = (trashedHeadsets * headsetPrice) +
                (trashedMouses * mousePrice) +
                (trashedKeyboards * keyboardPrice) +
                (trashedDisplays * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
    }
}
