package gradeCalc;

import java.util.Scanner;

public class GradeCalcApp {

	public static void main(String[] args) {
		double grade;
		Scanner inputGrade = new Scanner(System.in);
		System.out.print("Enter in the percentage: ");
		grade = inputGrade.nextDouble();
		inputGrade.close();
		
		if (grade <= 100 && grade >= 90) {
			System.out.println("The corresponding letter grade is: A");
		} else if (grade <= 89 && grade >= 80) {
			System.out.println("The corresponding letter grade is: B");
		} else if (grade <= 79 && grade >= 70) { 
			System.out.println("The corresponding letter grade is: C");
		} else if (grade <= 69 && grade >= 60) {
			System.out.println("The corresponding letter grade is: D");
		} else if (grade < 60) {
			System.out.println("The corresponding letter grade is: F");
		}
		

	}

}
