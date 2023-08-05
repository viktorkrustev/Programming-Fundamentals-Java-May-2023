import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = new ArrayList<>();

        String[] inputSequence = scanner.nextLine().split(" ");
        for (String number : inputSequence) {
            sequence.add(Integer.parseInt(number));
        }

        int removedSum = 0;

        while (!sequence.isEmpty()) {
            String[] indexes = scanner.nextLine().split(" ");
            if (indexes.length == 0) {
                break;
            }

            for (String index : indexes) {
                int i = Integer.parseInt(index);
                int removedValue;

                if (i < 0) {
                    removedValue = sequence.remove(0);
                    sequence.add(0, sequence.get(sequence.size() - 1));
                } else if (i >= sequence.size()) {
                    removedValue = sequence.remove(sequence.size() - 1);
                    sequence.add(sequence.get(0));
                } else {
                    removedValue = sequence.remove(i);
                }

                removedSum += removedValue;

                for (int j = 0; j < sequence.size(); j++) {
                    if (sequence.get(j) <= removedValue) {
                        sequence.set(j, sequence.get(j) + removedValue);
                    } else {
                        sequence.set(j, sequence.get(j) - removedValue);
                    }
                }
            }
        }

        System.out.println(removedSum);
    }
}
