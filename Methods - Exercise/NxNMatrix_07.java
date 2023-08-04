import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printSquare(n);

    }
    public static void printSquare(int n){
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",n);
            for (int j = 0; j < n-1; j++) {
                System.out.printf("%d ",n);
            }
            System.out.println();

        }

    }
}
