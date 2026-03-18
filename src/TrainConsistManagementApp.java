import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("====================================\n");

        Set<String> formation = new LinkedHashSet<>();

        formation.add("BG101");
        formation.add("BG102");
        formation.add("BG103");
        formation.add("BG104");

        formation.add("BG102");
        formation.add("BG101");

        System.out.println("Final Train Formation:");

        for (String bogie : formation) {
            System.out.println(bogie);
        }

        System.out.println("\nTotal Bogies: " + formation.size());
    }
}