import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int j = 1; j <=10 ; j++) {
            System.out.printf("%d X %d = %d\n",num,j,(num*j));

        }
    }
}
