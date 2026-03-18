import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("====================================\n");

        List<String> trainConsist = new LinkedList<>();

        trainConsist.add("BG101");
        trainConsist.add("BG102");
        trainConsist.add("BG103");

        System.out.println("Initial Train Consist: " + trainConsist);

        trainConsist.add(1, "BG100");

        System.out.println("After inserting BG100 at position 1: " + trainConsist);

        trainConsist.remove(0);

        System.out.println("After removing front bogie: " + trainConsist);

        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("After removing rear bogie: " + trainConsist);

        System.out.println("\nFinal Train Structure:");
        System.out.println(trainConsist);
    }
}