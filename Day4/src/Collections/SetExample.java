package Collections;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element, won't be added

        System.out.println("HashSet: " + set);

        // Check if an element exists
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Removing an element
        set.remove("Cherry");
        System.out.println("After removal: " + set);

        // Iterating through the Set
        System.out.println("Iterating over the set:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}

