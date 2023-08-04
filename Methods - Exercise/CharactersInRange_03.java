import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        printCharacters(a,b);

    }
    public static void printCharacters(char a, char b){
        for (int i = a + 1; i < b ; i++) {
            System.out.printf("%c ",i);

        }
        for (int i = b + 1; i < a ; i++) {
            System.out.printf("%c ",i);

        }
    }
}
