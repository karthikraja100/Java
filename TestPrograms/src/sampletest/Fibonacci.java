package sampletest;

public class Fibonacci {

	public static void main(String[] args) {
		int n=10;
		int n1=-1,n2=1;
		for(int i=0;i<=n;i++) {
			
			int next = n1+n2;
			n1=n2;
			n2=next;
			System.out.println(n1);
		}

	}

}
