package exercise_Chapter13;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int guess = 0;
		int num = random.nextInt(20) + 1;
		boolean hasWon = false;
		int life = 5;
		
		while(life != 0) {
			
			try {
			System.out.println("Guess the number(1-20): ");
			System.out.println("You have "+life+" lifes left");
			//System.out.println("The number to guess is: "+num);
				
			guess = sc.nextInt();
			
			if(num == guess) {
				
				hasWon = true;
				System.out.println("You have WON!!!!");
				break;
			}
			else if(guess > num) {
				
				System.out.println("Your guess is too high");
				continue;	
			}
			else if(guess < num) {
				
				System.out.println("Your guess is too low");
				continue;	
			}
			
			life--;
			}catch(Exception e) {
				
				System.out.println("Wrong input\nGAME ENDED!!!");
				System.exit(0);
			}

		}
		
		if(life == 0) {
			
			System.out.println("You have ran out of lifes\nYOU LOSE!!!!");
		}
		System.out.println("The number to guess was: "+num);

				
	}

}
