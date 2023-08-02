import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double max = 0;
        String maxName = "";
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius*radius * height;
            if (volume>max){
                max = volume;
                maxName = name;
            }

        }
        System.out.println(maxName);
    }
}
