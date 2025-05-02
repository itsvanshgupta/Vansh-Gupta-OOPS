import java.util.*;

public class UniqueNamesSet {
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};
        HashSet<String> uniqueNames = new HashSet<>(Arrays.asList(names));

        System.out.println("Unique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        String checkName = "Sourabh";
        if (uniqueNames.contains(checkName)) {
            System.out.println(checkName + " exists in the set.");
        } else {
            System.out.println(checkName + " does not exist in the set.");
        }
    }
}