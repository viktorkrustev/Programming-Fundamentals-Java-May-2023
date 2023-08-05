import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            list.add(i,product);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d.%s%n",i+1, list.get(i));

        }

    }
}
