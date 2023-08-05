import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");

        while(!command[0].equals("End")){
            switch (command[0]){
                case "Add":
                    int num = Integer.parseInt(command[1]);
                    list.add(num);
                    break;

                case "Insert":
                    int number  = Integer.parseInt(command[1]);
                    int index  = Integer.parseInt(command[2]);
                    if (index>=0 && index<= list.size() -1){
                        list.add((int) index,number);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Remove":
                    int n  = Integer.parseInt(command[1]);
                    if (n>=0 && n<= list.size() -1){
                        list.remove(n);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":
                    for (int i = 0; i < Integer.parseInt(command[2]); i++) {
                        int firstNum = list.get(0);
                        int lastNum = list.get(list.size() -1);
                        if (command[1].equals("left")){
                            list.add(firstNum);
                            list.remove(0);
                        } else {
                            list.add(0,lastNum);
                            list.remove(list.size()-1);
                        }

                    }

                    break;
            }

            command = scanner.nextLine().split(" ");
        }
        for (int el:list){
            System.out.print(el + " ");
        }

    }
}
