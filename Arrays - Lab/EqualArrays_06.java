import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numsArr1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numsArr2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean flag = true;

        for (int i = 0; i < numsArr1.length; i++) {
            if (numsArr1[i] == numsArr2[i]){
                sum+=numsArr1[i];
            } else{
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }
    }
}
