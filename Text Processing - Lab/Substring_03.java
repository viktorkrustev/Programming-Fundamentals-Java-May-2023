import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt1 = scanner.nextLine();
        String txt2 = scanner.nextLine();

        while (txt2.contains(txt1)){
            txt2 = txt2.replace(txt1, "");
        }
        System.out.println(txt2);

    }
}
