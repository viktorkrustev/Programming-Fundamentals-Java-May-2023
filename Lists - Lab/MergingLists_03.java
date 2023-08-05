import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> l1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> l2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int minSize = Math.min(l1.size(), l2.size());
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < minSize; i++) {
            newList.add(l1.get(i));
            newList.add(l2.get(i));
        }
        if (l1.size()>l2.size()){
            List<Integer> subList = l1.subList(minSize,l1.size());

            newList.addAll(subList);

        } else if (l1.size()<l2.size()){
            List<Integer> subList = l2.subList(minSize,l2.size());

            newList.addAll(subList);

        }
        System.out.println(newList.toString().replaceAll("[\\[\\],]", ""));

    }
}
