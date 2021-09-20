package printCalc;

import java.util.Scanner;
import java.text.NumberFormat;

public class PrintCalcProgram {

	public static void main(String[] args) {
		//
		int copies;
		Scanner copyCount = new Scanner(System.in);
		System.out.print("Enter the number of copies to be printed: ");
		copies = copyCount.nextInt();
		copyCount.close();
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		if (copies >= 0 && copies <= 99) {
			System.out.println("Price per copy is: $0.30");
			final double copyCost = copies * 0.30;
			System.out.println("Total cost is: " + money.format(copyCost));
		} else if (copies >= 100 && copies <= 499) {
			System.out.println("Price per copy is: $0.28");
			final double copyCost = copies * 0.28;
			System.out.println("Total cost is: " + money.format(copyCost));
		} else if (copies >= 500 && copies <= 749) {
			System.out.println("Price per copy is: $0.27");
			final double copyCost = copies * 0.27;
			System.out.println("Total cost is: " + money.format(copyCost));
		} else if (copies >= 750 && copies <= 1000) {
			System.out.println("Price per copy is: $0.26");
			final double copyCost = copies * 0.26;
			System.out.println("Total cost is: " + money.format(copyCost));
		} else if (copies > 1000) {
			System.out.println("Price per copy is: $0.25");
			final double copyCost = copies * 0.25;
			System.out.println("Total cost is: " + money.format(copyCost));
		}
		
		
		}

	}


