import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < nums.length - 1; i++) {
            int sum = 0;
            sum+=nums[i];
            for (int j = i+1; j <=nums.length-1 ; j++) {
                sum+=nums[j];

                if(sum==num){
                    System.out.printf("%d %d%n",nums[i],nums[j]);
                }
                else {
                    sum-=nums[j];
                }
            }

        }


    }
}
