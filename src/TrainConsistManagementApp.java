import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("====================================\n");

        Map<String, Integer> capacityMap = new HashMap<>();

        capacityMap.put("BG101", 72);
        capacityMap.put("BG102", 72);
        capacityMap.put("BG103", 64);
        capacityMap.put("BG104", 80);

        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }

        System.out.println("\nTotal Bogies Mapped: " + capacityMap.size());
    }
}