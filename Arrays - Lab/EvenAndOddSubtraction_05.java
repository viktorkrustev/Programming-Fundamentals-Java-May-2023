import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int[] numbers = Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){
                evenSum+=numbers[i];
            } else {
                oddSum+=numbers[i];
            }

        }
        System.out.println(evenSum-oddSum);

    }
}
