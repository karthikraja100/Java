package dayone;

public class Unary {
	public static void main(String[]args) {
		int a=10;
		//Post Increment
		System.out.println(a);//10
		System.out.println(a++);//10
		System.out.println(a);//11
		//Pre Increment
		int b=5;
		System.out.println(b);//5
		System.out.println(++b);//6
		System.out.println(b);//6
		//post and pre Decrement
		int c=10;
		System.out.println(c);//10
		System.out.println(c--);//10
		System.out.println(c);//9
		System.out.println(--c);//8
	}
}
