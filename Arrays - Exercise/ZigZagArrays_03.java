import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr1 = new String[n];
        String[] arr2 = new String[n];
        for (int i = 0; i < n; i++) {
            String[] nums = scanner.nextLine().split(" ");
            int firstNumber = Integer.parseInt(nums[0]);
            int secondNumber = Integer.parseInt(nums[1]);
            if (i % 2 == 0) {
                arr1[i] = String.valueOf(firstNumber);
                arr2[i] = String.valueOf(secondNumber);
            } else {
                arr1[i] = String.valueOf(secondNumber);
                arr2[i] = String.valueOf(firstNumber);
            }
        }
        for (String el : arr1) {
            System.out.print(el + " ");
        }
        System.out.println();
        for (String ell : arr2) {
            System.out.print(ell + " ");
        }
    }
}
