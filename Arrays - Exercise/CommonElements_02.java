import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");

        Set<String> set1 = new HashSet<>();
        for (String element : arr1) {
            set1.add(element);
        }

        Set<String> commonElements = new HashSet<>();
        int i = 0;
        while (i < arr2.length) {
            if (set1.contains(arr2[i])) {
                commonElements.add(arr2[i]);
            }
            i++;
        }

        for (String element : commonElements) {
            System.out.print(element + " ");
        }
    }
}
