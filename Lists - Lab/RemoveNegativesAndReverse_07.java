import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        nums.removeIf(num -> num < 0);

        for (int i = nums.size(); i>0; i--) {

            System.out.print(String.valueOf(nums.get(i-1)).trim() + " ");

        }
        if (nums.size() == 0){
            System.out.println("empty");
        }

    }
}
