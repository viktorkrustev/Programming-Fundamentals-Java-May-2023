import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kolkko = Integer.parseInt(scanner.nextLine());
        int obshto = 0;
        int takova = 0;
        boolean toe = false;
        for (int ch = 1; ch <= kolkko; ch++) {
            takova = ch;
            while (ch > 0) {
                obshto += ch % 10;
                ch = ch / 10;
            }
            toe = (obshto == 5) || (obshto == 7) || (obshto == 11);
            if (toe){
                System.out.printf("%d -> True%n", takova, toe);
            } else {
                System.out.printf("%d -> False%n", takova, toe);
            }
            obshto = 0;
            ch = takova;
        }

    }
}
