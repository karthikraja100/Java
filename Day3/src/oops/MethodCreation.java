package oops;
import java.util.*;
public class MethodCreation {
	
	public static int add(int a,int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a and b values :");
		int  i1=s1.nextInt();
		int  i2=s1.nextInt();
		System.out.println(add(i1,i2));
		s1.close();
	}

}
