import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        int sum = sum(n1,n2);
        int total = subtract(sum,n3);
        System.out.println(total);


    }

    public static int sum(int n1,int n2){
        return n1 + n2;
    }

    public static int subtract(int sum,int n3){
        return sum - n3;
    }
}
