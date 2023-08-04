import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrValues = scanner.nextLine().split(" ");
        int[] arr = new int[arrValues.length];
        for (int i = 0; i < arrValues.length; i++) {
            arr[i] = Integer.parseInt(arrValues[i]);
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");

            if (tokens[0].equals("swap")) {
                int index1 = Integer.parseInt(tokens[1]);
                int index2 = Integer.parseInt(tokens[2]);
                int temp = arr[index1];
                arr[index1] = arr[index2];
                arr[index2] = temp;
            } else if (tokens[0].equals("multiply")) {
                int index1 = Integer.parseInt(tokens[1]);
                int index2 = Integer.parseInt(tokens[2]);
                arr[index1] = arr[index1] * arr[index2];
            } else if (tokens[0].equals("decrease")) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i]--;
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
