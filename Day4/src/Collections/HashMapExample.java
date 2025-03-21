package Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 20);
        hashMap.put("Cherry", 30);

        // Display the HashMap
        System.out.println("HashMap: " + hashMap);

        // Access a value 
        System.out.println("Value for key 'Banana': " + hashMap.get("Banana"));

        // Check 
        System.out.println("Contains key 'Apple'? " + hashMap.containsKey("Apple"));

        // Remove 
        hashMap.remove("Cherry");
        System.out.println("HashMap after removal: " + hashMap);

        // Iteration
       /* System.out.println("Iterating through HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
            
          }*/
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        
    }
}

