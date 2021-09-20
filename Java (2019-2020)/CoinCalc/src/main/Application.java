package main;
import java.util.Scanner;
import java.text.NumberFormat;

public class Application {
	public static double getDollarAmt(int pennyAmt, int nickelAmt, int dimeAmt, int quarterAmt) {
		double dollarAmt = 0;
		dollarAmt += pennyAmt * 0.01;
		dollarAmt += nickelAmt * 0.05;
		dollarAmt += dimeAmt * 0.10;
		dollarAmt += quarterAmt * 0.25;
		return(dollarAmt);
	}

	public static void main(String[] args) {
		NumberFormat money = NumberFormat.getCurrencyInstance();
		Scanner usrInput = new Scanner(System.in);
		System.out.println("Enter in your total coins: ");
		System.out.println("Pennies:");
		int usrPennies = usrInput.nextInt();
		System.out.println("Nickels:");
		int usrNickels = usrInput.nextInt();
		System.out.println("Dimes:");
		int usrDimes = usrInput.nextInt();
		System.out.println("Quarters:");
		int usrQuarters = usrInput.nextInt();
		
		usrInput.close();
		double totalAmt = getDollarAmt(usrPennies, usrNickels, usrDimes, usrQuarters);
		System.out.print("Total: ");
		System.out.print(money.format(totalAmt));

	}

}
