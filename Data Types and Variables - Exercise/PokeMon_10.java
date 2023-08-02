import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        int startPower = p;

        int countTarget = 0;
        while (p >= d) {
            p -= d;
            countTarget++;

            if (p == startPower / 2) {
                if (factor != 0) {
                    p = p / factor;
                }
            }
        }

        System.out.println(p);
        System.out.println(countTarget);


    }
}
