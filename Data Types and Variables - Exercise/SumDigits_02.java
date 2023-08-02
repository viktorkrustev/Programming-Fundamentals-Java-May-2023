import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sim = 0;
        while (num>0){
            int dig = num%10;
            sim+=dig;
            num = num/10;

        }
        System.out.println(sim);
    }
}
