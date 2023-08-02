import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = scanner.nextInt();

        if (age >= 0 && age <= 18) {
            switch (dayType) {
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("5$");
                    break;
                default:
                    System.out.println("Error!");
            }
        } else if (age > 18 && age <= 64) {
            switch (dayType) {
                case "Weekday":
                    System.out.println("18$");
                    break;
                case "Weekend":
                    System.out.println("20$");
                    break;
                case "Holiday":
                    System.out.println("12$");
                    break;
                default:
                    System.out.println("Error!");
            }
        } else if (age > 64 && age <= 122) {
            switch (dayType) {
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("10$");
                    break;
                default:
                    System.out.println("Error!");
            }
        } else {
            System.out.println("Error!");
        }
    }
}
