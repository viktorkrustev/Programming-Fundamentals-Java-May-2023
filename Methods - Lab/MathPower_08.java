import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");

        double res = resultOfPower(num,power);
        System.out.println(df.format(res));



    }

    public static double resultOfPower(double num, int n){
        return Math.pow(num,n);
    }
}
