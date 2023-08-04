import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxLength = 1;
        int currentLength = 1;
        int endIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = i;
                }
            } else {
                currentLength = 1;
            }
        }

        int[] longestSequence = Arrays.copyOfRange(nums, endIndex - maxLength + 1, endIndex + 1);

        for (int i = 0; i < maxLength; i++) {
            System.out.print(longestSequence[i]);
            if (i < maxLength - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
