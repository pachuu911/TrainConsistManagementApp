import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("====================================\n");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("B1");
        passengerBogies.add("B2");
        passengerBogies.add("B3");

        System.out.println("Bogies after addition: " + passengerBogies);

        passengerBogies.remove("B2");

        System.out.println("Bogies after removal: " + passengerBogies);

        if (passengerBogies.contains("B1")) {
            System.out.println("B1 is available in the train.");
        } else {
            System.out.println("B1 is not available in the train.");
        }

        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}