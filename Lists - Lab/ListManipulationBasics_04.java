import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")){
            if (command[0].equals("Add")){
                int num = Integer.parseInt(command[1]);
                list.add(num);


            } else if (command[0].equals("Remove")) {
                list.remove(Integer.valueOf(command[1]));


            } else if (command[0].equals("RemoveAt")){
                list.remove(Integer.parseInt(command[1]));

            } else if (command[0].equals("Insert")) {
                list.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));


            }


            command = scanner.nextLine().split(" ");
        }
        for (int el:list){
            System.out.print(el + " ");
        }

    }
}
