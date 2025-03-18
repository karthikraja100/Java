package dayone;
import java.util.*;
public class Array {
public static void main(String[]args) {
	int[] source= {30,20,40,10,50};
	int[]destination=new int[5];
	//copy
	System.arraycopy(source, 0, destination, 0, source.length);
	for(int n:destination) {
		System.out.println(n+"");
	}
	Arrays.sort(source);
	System.out.println("Sorted Array : "+Arrays.toString(source));
}
}
