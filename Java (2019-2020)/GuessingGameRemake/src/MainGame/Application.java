package MainGame;

import java.lang.Math;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		
		/* setting up the variable and the scanner. since scanner's can't be reopened, 
		 * it'll only be closed once the game is complete
		 */
		
		boolean incorrectGuess = true;
		int randomNumber = (int)(20 * Math.random() + 1);
		int guessedNumber = 0;
		Scanner numberGuess = new Scanner(System.in);
		
		/*game loop. while the answer from the user is incorrect, the game will loop
		 * asking the user for their guess till their guess is correct.
		 */
		
		while (incorrectGuess) {
			System.out.print("Enter a number between 1 and 20: ");
			guessedNumber = numberGuess.nextInt();
			
			if (guessedNumber == randomNumber) {
				
				// and now we can close that scanner so the computer can be happy :)
				
				numberGuess.close();
				System.out.println("You won! Congratulations!");
				incorrectGuess = false;
			} else if (guessedNumber == 0) {
				System.out.println("Invalid number!");
				System.out.println("Try again!");
			} else if (!(guessedNumber == randomNumber)) {
				int difference = randomNumber - guessedNumber;
				System.out.println("You were only " + Math.abs(difference) + " away!");
				System.out.println("Try again!");
			}
		}

	}

}
