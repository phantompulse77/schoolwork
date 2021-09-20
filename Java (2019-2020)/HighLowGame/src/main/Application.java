package main;
import java.util.Scanner;
import java.lang.Math;

public class Application {

	public static void main(String[] args) {
		
		// telling them the rules
		System.out.println("Rules:");
		System.out.println("Numbers 1 through 6 are low.");
		System.out.println("Numbers 8 through 13 are high.");
		System.out.println("Number 7 is neither high or low.");
		
		// declaring all of the variables/objects
		int usrPoints = 1000;
		int risk = 0, prediction, randomNum, winCount = 0, roundCount = 0, riskCheck = 0;
		boolean usrDec;
		Scanner usrPrompt = new Scanner(System.in);
		
		// game-play loop
		while (usrPoints > 0) {
			riskCheck = 0;
			System.out.println("You have " + usrPoints + " points.");
			while (riskCheck == 0) {
				
				// how much are you risking?
				System.out.println("Enter points to risk: ");
				risk = usrPrompt.nextInt();
				
				// if statement to prevent improper numbers
				if (risk > usrPoints) {
					System.out.println("You cannot bet more than you have!");
				} else if (risk <= 0){
					System.out.println("You cannot bet anything equal to or less than zero.");
				} else {
					riskCheck += 1;
				}
			}
			
			// what's your prediction?
			System.out.println("Predict <1=High, 0=Low>: ");
			prediction = usrPrompt.nextInt();
			randomNum = (int)(13 * Math.random() + 1);
			System.out.println("Number is " + randomNum);
			
			// is it correct?
			if (randomNum >= 8 && prediction == 1) {
				System.out.println("You won.");
				usrPoints += risk * 2;
				roundCount += 1;
				winCount += 1;
			} else if (randomNum <= 6 && prediction == 0){
				System.out.println("You won.");
				usrPoints += risk * 2;
				roundCount += 1;
				winCount += 1;
			} else {
				System.out.println("You lost.");
				usrPoints -= risk;
				roundCount += 1;
			}
			
			if (usrPoints > 0) {
				System.out.println("Play again? (yes = true, no = false)");
				usrDec = usrPrompt.nextBoolean();
				if (usrDec == false) {
					usrPoints = -1;
				}
			}
			
		}
		
		usrPrompt.close();
		System.out.println("Game over! You won " + winCount + " times! You also won " + winCount + " out of " + roundCount + " rounds.");

	}

}
