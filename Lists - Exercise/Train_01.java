import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String[] command = scanner.nextLine().split(" ");

        while(!command[0].equals("end")){
            if (command[0].equals("Add")){
                int num = Integer.parseInt(command[1]);
                list.add(num);
            } else {
                int number = Integer.parseInt(command[0]);
                for (int i = 0; i < list.size() ; i++) {
                    int availableSpace = maxCapacity - list.get(i);
                    if (availableSpace >=  number) {
                        list.set(i, list.get(i) + number);
                        break;
                    }

                }
            }

            command = scanner.nextLine().split(" ");
        }
        for (Integer el: list){
            System.out.print(el + " ");
        }
    }
}
