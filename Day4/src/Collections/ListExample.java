package Collections;
import java.util.*;
public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrlist=new ArrayList<>();
		arrlist.add(100);
		arrlist.add(200);
		arrlist.add(300);
		arrlist.add(400);
		System.out.println("Using get and set");
		System.out.println(arrlist.get(0));
		int x =arrlist.set(0, 1000);
		System.out.println(x);
		arrlist.remove(2);
		
		
		for (int i:arrlist) {
			System.out.println(i);
		}
	}

}
