package array;

import java.util.Scanner;

public class LoopingThroughAnArray {

	public static void main(String[] args) {
		
		int [] ArrayDatabase = new int [12];


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int userInput = sc.nextInt();
		
		for (int i = 0; i < ArrayDatabase.length; i++) {
			
			ArrayDatabase[i] = userInput * i;
		}
		
		for(int element : ArrayDatabase) {
			
			
			System.out.println("The number stored are: " + element);
		}
	}

}
