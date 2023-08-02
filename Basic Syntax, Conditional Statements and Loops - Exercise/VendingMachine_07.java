import java.text.DecimalFormat;
import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double totalMoney = 0;

        String input = scanner.nextLine();
        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                totalMoney += coin;
            } else {
                System.out.println("Cannot accept " + decimalFormat.format(coin));
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")) {
            double price = 0;

            switch (product) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    product = scanner.nextLine();
                    continue;
            }

            if (totalMoney < price) {
                System.out.println("Sorry, not enough money");
            } else {
                totalMoney -= price;
                System.out.println("Purchased " + product);
            }

            product = scanner.nextLine();
        }

        System.out.println("Change: " + decimalFormat.format(totalMoney));
    }
}
