import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < nums.length - 1; i++) {
            boolean isBigger = true;
            for (int j = i+1; j <= nums.length-1 ; j++) {

                if (nums[i]<=nums[j]){
                    isBigger = false;
                    break;

                }
            }
            if (isBigger){
                System.out.printf("%d ",nums[i]);
            }

        }
        System.out.print(nums[nums.length-1]+ " ");

    }
}
