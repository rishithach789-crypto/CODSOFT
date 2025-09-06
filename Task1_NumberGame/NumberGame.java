import java.util.Scanner;
import java.util.Random;
public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Random rand=new Random();
		int numberToGuess=rand.nextInt(100)+1;
		int attempts =5;
		boolean guessed = false;
		System.out.println("Welcome to Number Guessing Game!");
		System.out.println("Guess the number between 1 and 100.");
		System.out.println("You have "+attempts +" attempts.");
		
		for(int i=1;i<=attempts;i++) {
			System.out.println("Attempt "+i+" - Enter your guess: ");
			int guess=sc.nextInt();
			
			if(guess == numberToGuess) {
				System.out.println("Congratulations! You guessed the number in "+i+" attempts.");
				guessed =true;
				break;
			}else if(guess < numberToGuess) {
				System.out.println("Too low! Try again, you can do it.");
			}else {
				System.out.println("Too high! Try again, you can do it");
			}
		}
		if(!guessed) {
			System.out.println("Sorry! You've used all attempts. The number was: "+ numberToGuess);
		}
		sc.close();
	}
}
