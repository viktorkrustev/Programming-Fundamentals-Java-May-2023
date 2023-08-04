import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double b  = Double.parseDouble(scanner.nextLine());

        double result = 0;

        switch (command){
            case "+":
                result = printAdd(a,b);
                System.out.printf("%.0f",result);
                break;
            case "*":
                result = printMultiply(a,b);
                System.out.printf("%.0f",result);
                break;
            case "-":
                result = printSubstract(a,b);
                System.out.printf("%.0f",result);
                break;
            case  "/":
                result = printDivide(a,b);
                System.out.printf("%.0f",result);
                break;
        }



    }

    public static double printAdd(double a, double b){
        return a+b;
    }

    public static double printMultiply(double a, double b){
        return a*b;
    }

    public static double printDivide(double a, double b){
        return a/b;
    }

    public static double printSubstract(double a, double b){
        return a-b;
    }
}
