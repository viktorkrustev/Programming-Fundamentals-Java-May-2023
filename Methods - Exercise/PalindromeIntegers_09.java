import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")){

            System.out.println(isPalindrome(command));

            command = scanner.nextLine();
        }

    }

    public static boolean isPalindrome(String txt){
        String text = "";
        for (int i = txt.length() - 1; i >=0 ; i--) {
            text+=txt.charAt(i);

        }
        return text.equals(txt);
    }
}
