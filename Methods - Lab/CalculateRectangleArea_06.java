import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double res = calculateArea(a,b);
        System.out.printf("%.0f",res);


    }

    public static double calculateArea(double a, double b){
        return a * b;
    }
}
