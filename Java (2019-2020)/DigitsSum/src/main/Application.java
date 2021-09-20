package main;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		// do you really need me to explain all this?
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter in a positive integer: ");
		String digitsNum = userInput.next();
		userInput.close();
		int loopLength = digitsNum.length();
		loopLength -= 1; // Indexes of Strings in Java start at 0, instead of one.
		
		int addend = 0;
		int sum = 0;
		
		while (loopLength > -1) {
			/* The statement below essentially converts a char to a string and then a string to an integer.
			 * This is due to the substring of a string restricted to be casted as a char, instead of an integer.
			 */
			
			addend = Integer.parseInt(String.valueOf((digitsNum.charAt(loopLength))));
			sum += addend;
			loopLength -= 1;
		}
		System.out.println("The sum of the digits is: " + sum);
		

	}

}
