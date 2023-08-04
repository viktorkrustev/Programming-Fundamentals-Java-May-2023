import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            nums[i] += num;
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            System.out.printf("%d ",nums[i]);

        }
    }
}
