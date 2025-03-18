package sampletest;

public class Prime {
public static void main(String[]args) {
	for (int num = 2; num <= 100; num++) { // Check numbers up to 100
	    boolean isPrime = true; // Assume the number is prime
	    for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors
	        if (num % i == 0) { // If divisible, it's not prime
	            isPrime = false;
	            break;
	        }
	    }
	    if (isPrime) { // Print if the number is prime
	        System.out.println(num + " is a prime number");
	    }
	}

}
}
