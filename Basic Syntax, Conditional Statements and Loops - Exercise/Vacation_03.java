import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double pricePerPerson = 0;

        if (groupType.equals("Students")) {
            if (dayOfWeek.equals("Friday")) {
                pricePerPerson = 8.45;
            } else if (dayOfWeek.equals("Saturday")) {
                pricePerPerson = 9.80;
            } else if (dayOfWeek.equals("Sunday")) {
                pricePerPerson = 10.46;
            }
        } else if (groupType.equals("Business")) {
            if (dayOfWeek.equals("Friday")) {
                pricePerPerson = 10.90;
            } else if (dayOfWeek.equals("Saturday")) {
                pricePerPerson = 15.60;
            } else if (dayOfWeek.equals("Sunday")) {
                pricePerPerson = 16.00;
            }
        } else if (groupType.equals("Regular")) {
            if (dayOfWeek.equals("Friday")) {
                pricePerPerson = 15.00;
            } else if (dayOfWeek.equals("Saturday")) {
                pricePerPerson = 20.00;
            } else if (dayOfWeek.equals("Sunday")) {
                pricePerPerson = 22.50;
            }
        }

        double totalPrice = groupSize * pricePerPerson;

        if (groupType.equals("Students") && groupSize >= 30) {
            totalPrice *= 0.85;
        } else if (groupType.equals("Business") && groupSize >= 100) {
            totalPrice -= (10 * pricePerPerson);
        } else if (groupType.equals("Regular") && groupSize >= 10 && groupSize <= 20) {
            totalPrice *= 0.95;
        }

        String formattedPrice = String.format("%.2f", totalPrice);

        System.out.println("Total price: " + formattedPrice);
    }
}
