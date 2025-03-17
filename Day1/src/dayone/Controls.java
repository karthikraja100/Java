package dayone;

public class Controls {
	public static void main(String[]args) {
		int a=10;
		int b=20;
		int c=30;
		//if else
		if(a<b) {
			System.out.println("A LessThan B");
		}else {
			System.out.println("A GreaterThan B");
		}
		//nested if
		if(a<b) {
			if(a%2==0) {
				System.out.println(a+" is Even");
			}
		//ladder 
			if(a>b && a>c) {
				System.out.println("A is Bigger");
			}else if(a<b && b>c) {
				System.out.println("A is Bigger");
			}else if(c>a && c>b) {
				System.out.println("A is Bigger");
			}else {
				System.out.println("All are Equal ");
			}
		
		}
	}
}
