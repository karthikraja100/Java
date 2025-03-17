package dayone;

import java.util.Scanner;

public class SampleSwitch {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b=s.nextInt();
		char result ;
		System.out.println("+ or - -->");
		result=s.next().charAt(0);
		switch(result) {
		case '+':
			int c=a+b;
			System.out.println("ADD "+c);
			break;
		case '-':
			int d=a-b;
			System.out.println("SUB "+d);
			break;	
		default:
			System.out.println("Wrong Choice");
		}
	}
}
