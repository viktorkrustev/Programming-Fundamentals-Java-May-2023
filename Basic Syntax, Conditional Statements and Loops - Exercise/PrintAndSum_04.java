import java.util.Scanner;

public class PrintAndSum_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = n1; i <=n2 ; i++){
            sum+=i;
            System.out.printf("%d ",i);


        }
        System.out.println();
        System.out.printf("Sum: %d\n",sum);
    }
}
