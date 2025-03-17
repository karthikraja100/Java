package dayone;

public class Assignment {
	public static void main(String[]args) {
		/*int a=50;
		System.out.println(a+=50);//a=a+50 ->a=100
		System.out.println(a/=5);//a=a/5 -->a=20
		System.out.println(a*=5);*/
		int a=5;
		int b=10;
		a+=b;
		b=a-b;
		a-=b;
		System.out.println(a);
		System.out.println(b);
	}
}
