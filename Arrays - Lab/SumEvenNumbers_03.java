import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersArr = scanner.nextLine().split(" ");
        int[] nums = Arrays.stream(numbersArr).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                sum+=nums[i];
            }

        }
        System.out.println(sum);
    }
}
