import java.util.Scanner;

public class BackIn30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int totalMin = (hours*60) + min + 30;
        int h = totalMin/60;
        int m = totalMin%60;

        if (hours>23 && min>=30){
            h = 0;
        } else if (hours==23 && min>=30){
            h=0;
        }
        System.out.printf("%d:%02d",h,m);

    }
}