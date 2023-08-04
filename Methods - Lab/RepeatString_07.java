import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String repeatRes = repeatString(txt,n);
        System.out.print(repeatRes);



    }

    public static String repeatString (String txt, int n){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append(txt);

        }
        return res.toString();
    }
}
