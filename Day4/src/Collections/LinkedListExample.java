package Collections;
import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10); // Add at the end
        list.add(20);
        list.add(30);
        System.out.println("Initial List: " + list);

        // Adding elements at specific positions
        list.addFirst(5); // Add at the beginning
        list.addLast(40); // Add at the end
        list.add(2, 15); // Add at index 2
        System.out.println("After adding elements: " + list);

        // Removing elements
        list.removeFirst(); // Remove first element
        list.removeLast(); // Remove last element
        list.remove(1); // Remove element at index 1
        System.out.println("After removing elements: " + list);

        // Accessing elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at Index 1: " + list.get(1));

        // Iterating through the list
        System.out.println("Iterating using for-each loop:");
        for (int num : list) {
            System.out.println(num);
        }

        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking properties
        System.out.println("List contains 20: " + list.contains(20));
        System.out.println("Size of List: " + list.size());

        // Clearing the list
        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}
