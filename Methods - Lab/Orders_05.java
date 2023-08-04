import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        switch (option){
            case "coffee":
                coffee(n);
                break;
            case "water":
                water(n);
                break;
            case "coke":
                coke(n);
                break;
            case "snacks":
                snacks(n);
                break;
        }



    }

    public static void coffee(int n){
        System.out.printf("%.2f", n*1.50);
    }

    public static void water(int n){
        System.out.printf("%.2f",n*1.00);
    }

    public static void coke(int n){
        System.out.printf("%.2f",n*1.40);
    }

    public static void snacks(int n){
        System.out.printf("%.2f",n*2.00);
    }
}
