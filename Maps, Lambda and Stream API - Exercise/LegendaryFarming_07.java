import java.util.*;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();

        String obtainedItem = "";

        while (obtainedItem.equals("")) {
            String[] input = scanner.nextLine().toLowerCase().split(" ");

            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1];

                if (keyMaterials.containsKey(material)) {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);

                    if (keyMaterials.get(material) >= 250) {
                        obtainedItem = material;
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        break;
                    }
                } else {
                    junkItems.putIfAbsent(material, 0);
                    junkItems.put(material, junkItems.get(material) + quantity);
                }
            }
        }

        printObtainedItem(obtainedItem);
        printRemainingMaterials(keyMaterials);
        printJunkItems(junkItems);
    }

    private static void printObtainedItem(String obtainedItem) {
        String legendaryItem = "";
        switch (obtainedItem) {
            case "shards":
                legendaryItem = "Shadowmourne";
                break;
            case "fragments":
                legendaryItem = "Valanyr";
                break;
            case "motes":
                legendaryItem = "Dragonwrath";
                break;
        }
        System.out.println(legendaryItem + " obtained!");
    }

    private static void printRemainingMaterials(Map<String, Integer> keyMaterials) {
        keyMaterials.forEach((material, quantity) -> System.out.println(material + ": " + quantity));
    }

    private static void printJunkItems(Map<String, Integer> junkItems) {
        junkItems.forEach((material, quantity) -> System.out.println(material + ": " + quantity));
    }
}