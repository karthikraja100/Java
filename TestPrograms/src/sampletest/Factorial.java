package sampletest;

public class Factorial {
public static void main(String[]args) {
	int n=4;
	int res=1;
	for(int i=0;i<=n;i++) { //multiple each num
		res*=i;
	}
	System.out.println("Factorial of " + n + " is " + res);
}
}
