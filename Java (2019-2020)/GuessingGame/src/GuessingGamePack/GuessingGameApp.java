package GuessingGamePack;

import java.lang.Math;
import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		//
		int randomNumber = (int)(20 * Math.random() + 1);
		Scanner numberGuess = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 20: ");
		int guessedNumber = numberGuess.nextInt();
		numberGuess.close();
		System.out.println("Computer's Number: " + randomNumber);
		System.out.println("Your Number: " + guessedNumber);
		
		if (guessedNumber == randomNumber) {
			System.out.println("You won! Congratulations!");
		} else {
			int difference = randomNumber - guessedNumber;
			System.out.println("You were only " + Math.abs(difference) + " away!");
			System.out.println("Better luck next time!");
		}

	}

}
