package stringmethods;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        // Reading input as a String
        String input = s.next();
        
        // Converting the String to a char array
        char[] arr = input.toCharArray();
        
        // Reversing the char array
        System.out.print("Reversed string: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        
        // Closing the scanner
        s.close();
    }
}
