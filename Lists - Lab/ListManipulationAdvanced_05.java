import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            StringBuilder output = new StringBuilder();

            if (command[0].equals("Contains")) {
                if (list.contains(Integer.parseInt(command[1]))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }

            } else if (command[1].contains("even")) {
                for (int el : list) {
                    if (el % 2 == 0) {
                        output.append(el).append(" ");
                    }
                }
                System.out.println(output);

            } else if (command[1].contains("odd")) {
                for (int el : list) {
                    if (el % 2 != 0) {
                        output.append(el).append(" ");
                    }
                }
                System.out.println(output);

            } else if (command[1].contains("sum")) {
                int sum = 0;
                for (Integer el : list) {
                    sum += el;
                }
                System.out.println(sum);

            } else if (command[0].equals("Filter")) {
                if (command[1].equals(">")) {
                    for (int i = 0; i < list.size(); i++) {
                        int number = Integer.parseInt(command[2]);
                        if (list.get(i) > number) {
                            output.append(list.get(i)).append(" ");
                        }
                    }
                } else if (command[1].equals("<")) {
                    for (int i = 0; i < list.size(); i++) {
                        int number = Integer.parseInt(command[2]);
                        if (list.get(i) < number) {
                            output.append(list.get(i)).append(" ");
                        }
                    }
                } else if (command[1].equals("<=")) {
                    for (int i = 0; i < list.size(); i++) {
                        int number = Integer.parseInt(command[2]);
                        if (list.get(i) <= number) {
                            output.append(list.get(i)).append(" ");
                        }
                    }
                } else if (command[1].equals(">=")) {
                    for (int i = 0; i < list.size(); i++) {
                        int number = Integer.parseInt(command[2]);
                        if (list.get(i) >= number) {
                            output.append(list.get(i)).append(" ");
                        }
                    }
                }
                System.out.println(output);
            }

            command = scanner.nextLine().split(" ");
        }
    }
}
