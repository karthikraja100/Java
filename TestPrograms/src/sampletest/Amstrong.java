package sampletest;

public class Amstrong {
public static void main(String[]args) {
	int number = 153; // Test number
	int original = number, result = 0;
	while (original != 0) { // Extract each digit
	    int digit = original % 10;
	    result += Math.pow(digit, 3); // Sum of cubes of digits
	    original /= 10; // Remove last digit
	}
	if (result == number) {
	    System.out.println(number + " is an Armstrong number");
	} else {
	    System.out.println(number + " is not an Armstrong number");
	}

}
}
