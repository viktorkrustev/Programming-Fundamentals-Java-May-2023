import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());


        String[] command = scanner.nextLine().split(" ");

        while(!command[0].equals("end")){
            if (command[0].equals("Delete")){
                int numberToDelete = Integer.parseInt(command[1]);
                list.removeIf(num -> num == numberToDelete);

            } else {
                int element = Integer.parseInt(command[1]);
                int index = Integer.parseInt(command[2]);
                list.add(index,element);

            }

            command = scanner.nextLine().split(" ");
        }
        for (Integer el: list){
            System.out.print(el + " ");
        }
    }
}
