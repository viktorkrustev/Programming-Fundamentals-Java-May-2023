import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, List<String>> teams = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")){

            if (command.contains(" | ")){
                String team = command.split(" \\| ")[0];
                String player = command.split(" \\| ")[1];

                if (!teams.containsKey(team)){
                    teams.put(team, new ArrayList<>());
                }
                boolean isExist = false;
                for (List<String> list: teams.values()){
                    if (list.contains(player)){
                        isExist = true;
                        break;
                    }
                }
                if (!isExist){
                    teams.get(team).add(player);
                }

            } else {
                String player = command.split(" -> ")[0];
                String team = command.split(" -> ")[1];

                teams.forEach((key, value) -> value.remove(player));

                if (!teams.containsKey(team)){
                    teams.put(team, new ArrayList<>());
                    teams.get(team).add(player);
                } else {
                    teams.get(team).add(player);
                }

                System.out.printf("%s joins the %s side!%n", player, team);

            }

            command = scanner.nextLine();
        }
        teams.entrySet().stream().filter(teamEntry -> teamEntry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}