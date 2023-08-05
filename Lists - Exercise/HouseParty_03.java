import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command[2].equals("going!")){
                if (people.contains(command[0])){
                    System.out.printf("%s is already in the list!%n",command[0]);
                } else {


                    people.add(command[0]);
                }
            } else {
                if (!people.contains(command[0])){
                    System.out.printf("%s is not in the list!%n",command[0]);
                }else {
                    people.remove(command[0]);
                }
            }

        }
        for (String el : people){
            System.out.println(el + " ");
        }

    }
}
