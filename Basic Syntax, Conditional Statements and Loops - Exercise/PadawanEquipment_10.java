import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int lightsabersNeeded = (int) Math.ceil(students * 1.1);
        int robesNeeded = students;
        int beltsNeeded = students - (students / 6);

        double totalCost = (lightsabersNeeded * lightsaberPrice) +
                (robesNeeded * robePrice) +
                (beltsNeeded * beltPrice);

        if (totalCost <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        } else {
            double neededMoney = totalCost - money;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }
    }
}
