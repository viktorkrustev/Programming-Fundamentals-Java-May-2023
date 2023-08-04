import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] symbols = scanner.nextLine().split(" ");
        String[] reversedArr = new String[symbols.length];
        int index = 0;
        for (int i = symbols.length - 1; i >= 0; i--) {
            reversedArr[index] = symbols[i];
            index++;

        }

        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }

    }
}
