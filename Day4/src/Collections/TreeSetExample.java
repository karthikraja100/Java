package Collections;
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(20);

        System.out.println("TreeSet (sorted order): " + treeSet);

        // Attempt to add a duplicate element
        treeSet.add(30); // Duplicate, won't be added
        System.out.println("After trying to add duplicate: " + treeSet);

        // Accessing first and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Removing an element
        treeSet.remove(20);
        System.out.println("After removing 20: " + treeSet);

        // Checking for element existence
        System.out.println("Contains 40? " + treeSet.contains(40));

        // Iterating through the TreeSet
        
        System.out.println("Iterating over TreeSet:");
        for (int num : treeSet) {
            System.out.println(num);
        }

        // Navigable operations
        System.out.println("Higher than 30: " + treeSet.higher(30)); // Next higher element
        System.out.println("Lower than 30: " + treeSet.lower(30)); // Next lower element
    }
}

