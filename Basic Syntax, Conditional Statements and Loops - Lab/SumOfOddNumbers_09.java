import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        for (int i = 1; count < n  ; i+=2) {
            System.out.println(i);
            sum+=i;
            count++;
        }
        System.out.printf("Sum: %d",sum);

    }
}
