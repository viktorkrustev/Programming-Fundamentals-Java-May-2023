import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(" -> ");

        Map<String, List<String>> users = new LinkedHashMap<>();

        while (!command[0].equals("End")){
            String name = command[0];
            String id = command[1];

            if (!users.containsKey(name)){
                users.put(name, new ArrayList<>());
                users.get(name).add(id);
            } else {
                if (!users.get(name).contains(id)){
                    users.get(name).add(id);
                }
            }

            command = scanner.nextLine().split(" -> ");
        }
        for (Map.Entry<String, List<String>> entry : users.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach((v) -> System.out.println("-- " + v));
        }

    }
}
