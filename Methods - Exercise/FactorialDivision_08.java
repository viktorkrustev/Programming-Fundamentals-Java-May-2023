import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        float res1 = factorial1(num1);
        float res2 = factorial2(num2);

        double total =  res1/res2;
        System.out.printf("%.2f",total);


    }

    public static float factorial1(int num1){
        float result = 1;
        for (int i = num1; i >=1 ; i--) {
            result*=i;
        }
        return result;
    }

    public static float factorial2(int num2){
        float result = 1;
        for (int i = num2; i >=1 ; i--) {
            result*=i;
        }
        return result;
    }
}
