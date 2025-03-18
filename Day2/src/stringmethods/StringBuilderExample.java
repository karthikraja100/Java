package stringmethods;
import java.util.*;
public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuilder is not ThreadSafe	
		StringBuilder sb = new StringBuilder("Hello");
		//Append
		sb.append("World");
		System.out.println("After Append "+ sb);
		//Insert
		sb.insert(5, ",");
		System.out.println("After Insert "+ sb);
		//replace
		sb.replace(6, 12, "Everyone");
		System.out.println("After Replace "+sb);
		//reverse
		sb.reverse();
		System.out.println("After Reverse "+sb);
		
		

	}

}
