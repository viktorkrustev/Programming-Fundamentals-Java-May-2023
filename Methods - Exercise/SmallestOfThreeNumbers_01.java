import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int min = smallestNumber(num1,num2,num3);
        System.out.println(min);

    }

    public static int smallestNumber(int a, int b, int c){
        int min = a;
        if (b<a){
            min = b;
        }
        if (c<min){
            min=c;
        }
        return min;
    }
}
