package dateCalculator;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Calculation {

	public static void main(String[] args) {
		// 
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
		
		Scanner bY = new Scanner(System.in);
		System.out.println("Enter your birthdate:");
		System.out.println("Year:");
		int birthYear = bY.nextInt();
		bY.close();
		Scanner bM = new Scanner(System.in);
		System.out.println("Month:");
		int birthMonth = bM.nextInt();
		bM.close();
		Scanner bD = new Scanner(System.in);
		System.out.println("Day:");
		int birthDay = bD.nextInt();
		bD.close();
		// Now for the current day...
		Scanner cY = new Scanner(System.in);
		System.out.println("Enter today's date:");
		System.out.println("Year:");
		int currentYear = cY.nextInt();
		cY.close();
		Scanner cM = new Scanner(System.in);
		System.out.println("Month:");
		int currentMonth = cM.nextInt();
		cM.close();
		Scanner cD = new Scanner(System.in);
		System.out.println("Day:");
		int currentDay = cD.nextInt();
		cD.close();
		
		String birthDateString = Integer.toString(birthMonth) + "/" Integer.toString(birthDay) + "/" + Integer.toString(birthYear);
		String currentDateString = Integer.toString(currentMonth) + Integer.toString(currentDay) + Integer.toString(currentYear);
		Date birthDate = sdf.parse();
	}

}
