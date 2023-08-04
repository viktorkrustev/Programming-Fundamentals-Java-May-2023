import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt_10 {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

            String[] command = scanner.nextLine().split(" ");
            while(!command[0].equals("Yohoho!")){
                if (command[0].equals("Loot")){
                    List<String> subList = Arrays.stream(command).collect(Collectors.toList()).subList(1, command.length);
                    for (String el:subList){
                        if (!list.contains(el)){
                            list.add(0,el);
                        }
                    }
                } else if (command[0].equals("Drop")) {
                    int index = Integer.parseInt(command[1]);
                    if (index>=0 && index<=list.size()-1){
                        String el = list.get(index);
                        list.add(el);
                        list.remove(index);
                    }
                } else if (command[0].equals("Steal")) {
                    int n = Integer.parseInt(command[1]);
                    List<String> l1 = new ArrayList<>();
                    int count = 0;
                    for (int i = list.size()-1; i >=0 ; i--) {
                        String el = list.get(i);
                        l1.add(el);
                        list.remove(el);
                        count++;
                        if (count>=n){
                            break;
                        }
                    }
                    Collections.reverse(l1);
                    System.out.println(String.join(", ",l1));
                }


                command = scanner.nextLine().split(" ");
            }
            int sum =0;

            for (int i = 0; i < list.size(); i++) {
                String word = list.get(i);
                int wordLength = word.length();
                sum+=wordLength;

            }
            if (sum>0){
                System.out.printf("Average treasure gain: %.2f pirate credits.",sum*1.0/ list.size());
            } else {
                System.out.println("Failed treasure hunt.");
            }
        }
    }

}
