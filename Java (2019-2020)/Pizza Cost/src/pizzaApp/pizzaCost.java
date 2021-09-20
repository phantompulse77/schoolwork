package pizzaApp;

import java.util.Scanner;
import java.text.NumberFormat;

public class pizzaCost {

	public static void main(String[] args) {
		// Declaring our fixed variables...
		final double laborCost = 0.75;
		final int rentCost = 1;
		Scanner d = new Scanner(System.in);
		System.out.println("Enter the diameter of your desired pizza! (no decimals) (inches):");
		int diameter = d.nextInt();
		d.close();
		double materials = 0.05 * (double)diameter * (double)diameter;
		double result = materials + laborCost + (double)rentCost;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("The cost of making the pizza is: " + money.format(result));

	}

}
