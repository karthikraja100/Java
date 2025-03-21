package Collections;
import java.util.*;
public class SimpleQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		// Adding elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue after adding elements: " + queue);

        // Accessing the head of the queue
        System.out.println("Head of the queue: " + queue.peek());

        // Removing elements from the queue
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue after removal: " + queue);

        // Checking if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}

	


