import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("lower-case");
        }
    }
}
