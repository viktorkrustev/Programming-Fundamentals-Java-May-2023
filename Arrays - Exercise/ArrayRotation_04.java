import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String first = nums[0];
            for (int j = 0; j < nums.length-1; j++) {
                nums[j] = nums[j+1];

            }
            nums[nums.length - 1] = first;

        }
        for (String el:nums){
            System.out.print(el + " ");
        }
    }
}
