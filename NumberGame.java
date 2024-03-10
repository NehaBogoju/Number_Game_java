package Project;

import java.util.Random;
import java.util.*;
public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		Scanner sc = new Scanner(System.in);
		char play;
		int guess;
		int max_limit=5;
		int numberOfAttempts=0;
		int won=0;
		do {
			int randomNumber = random.nextInt(100) + 1;
			int diff=(100-randomNumber)/2;
			System.out.println("Random number between 1 and 100: " + randomNumber);
			for(int i=1;i<=max_limit;i++) {
				System.out.println("Guess a number between 1 to 100(inclusively) :");
				guess=sc.nextInt();
				// too low
				if(guess<(randomNumber/2)) {
					System.out.println("Guessed number is too low. Try again!");
				}
				//low
				else if(guess>(randomNumber/2) && guess<(randomNumber)) {
					System.out.println("Guessed number is low. Try again!");
				}
				//high
				
				else if(guess>randomNumber && guess<randomNumber+diff) {
					System.out.println("Guessed number is high. Try again!");
				}
				//too high
				else if(guess>randomNumber+diff && guess<=100){
					System.out.println("Guessed number is too high. Try again!");
				}
				//correct
				else if(guess==randomNumber) {
					System.out.println("Yahoo! You guessed right.");
					won++;
					break;
				}
				else {
					System.out.println("Guessed number is out of required range.");
				}
				if(i==5) {
					System.out.println("You crossed the limit of guessing.");
				}
			}
			numberOfAttempts++;
			System.out.println("Your Score : ");
			System.out.println("Number of attempts : "+numberOfAttempts+"     You Won : "+won);
			System.out.println("Do you want to play this game again?(Yes or No):");
			play=sc.next().charAt(0);
		}while(play=='y');
		System.exit(0);	
	}

}
