import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();

        StringBuilder nums = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder characters = new StringBuilder();

        for (int i = 0; i < txt.length(); i++) {
            char currentSymbol = txt.charAt(i);
            if (Character.isDigit(currentSymbol)){
                nums.append(currentSymbol);
            } else if (Character.isLetter(currentSymbol)) {
                letters.append(currentSymbol);
            }else {
                characters.append(currentSymbol);
            }
        }
        System.out.println(nums);
        System.out.println(letters);
        System.out.println(characters);

    }
}
