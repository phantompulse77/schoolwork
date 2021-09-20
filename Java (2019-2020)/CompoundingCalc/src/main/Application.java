package main;

import java.util.Scanner;
import java.text.NumberFormat;

public class Application {

	public static void main(String[] args) {
		
		/* Pretty standard procedure here. Ask for input from the user and take the input from the scanner object
		 * and store it into double variables.
		 */
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter in your annual rate (in decimal): ");
		final double annualRate = userInput.nextDouble();
		
		System.out.print("Enter in the value of your investment: ");
		double investment = userInput.nextDouble();
		
		System.out.print("Enter in how much you'd like the investment to be: ");
		double target = userInput.nextDouble();
		userInput.close(); // We don't need to take any more input.
		int yearsCount = 0;
		NumberFormat money = NumberFormat.getCurrencyInstance(); // These will be useful later so let's declare them now.
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		
		do {
			
			// While the investment is less than the target we add on the annual rate, while incrementing the year.
			investment += (investment * annualRate);
			yearsCount++;
			
		} while (investment < target);
		
		// The percent format method will round up automatically. so 0.075 will be come 8%, even though it's 7.5%.
		System.out.println ("To reach " + money.format(target) + ", at a rate of " + percent.format(annualRate) + " it will take " + yearsCount + " years.");
		

	}

}
