import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] nums;
        if (input.startsWith("-")) {
            nums = Arrays.stream(input.substring(1).split("")).mapToInt(Integer::parseInt).toArray();
        } else {
            nums = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
        }
        int evenSum = sumEvenDigits(nums);
        int oddSum = sumOddDigits(nums);

        int result = getMultipleOfEvensAndOdds(evenSum,oddSum);
        System.out.println(result);


    }
    public static int getMultipleOfEvensAndOdds(int sum1, int sum2){
        return sum1 * sum2;
    }

    public static int sumEvenDigits(int[] num){
        int sum1 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2==0){
                sum1+=num[i];
            }
        }
        return sum1;
    }

    public static int sumOddDigits(int[] num){
        int sum2 = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i]%2!=0){
                sum2+=num[i];
            }
        }
        return sum2;
    }
}
