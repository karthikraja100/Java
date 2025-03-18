package stringmethods;

import java.util.Scanner;

public class Userinput {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		System.out.println("Hello "+name);
		//Length starts from 1
		System.out.println("Length : "+name.length());
		System.out.println("StIndex : ");
		int si=sc.nextInt();
		//subsrting(int beginIndex) - returns a part of string starting from Specified index 
		System.out.println(name.substring(si));
		System.out.println("EndIndex : ");
		int ei=sc.nextInt();
		//subsrting(int beginIndex,endIndex) - returns a part of string starting from Specified index till endindex
		System.out.println(name.substring(si,ei));
		
	
	}

}
