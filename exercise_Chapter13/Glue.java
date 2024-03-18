package exercise_Chapter13;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Glue {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
				
		String[] arr = new String[20];
		boolean isExit = false;
			
		for(int i = 0; i < arr.length; i++) {
			
			try {
				System.out.println("Enter a single character to form a word(max 20) and write exit when done: ");
				
				String letter = sc.next();
					
				
				if(letter.equals("exit")) {
					
					
					isExit = true;
					
					System.out.println("Your full word is: ");
					
					for(String el : arr) {
						if(el != null) {
						System.out.print(el);
						}
					}
					

					System.exit(0);	

					
				}else {
					
					arr[i] = letter;

					continue;
				}

				
			}catch(InputMismatchException e) {
				
				System.out.println("Error: "+e+" \nOnly characters allowed");
			}
			
			
		}	
		
	}

}
