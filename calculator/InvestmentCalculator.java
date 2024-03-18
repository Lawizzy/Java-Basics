package calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class InvestmentCalculator {
	
	
	public static final int YEAR = 12;
	
	private static double calculateFutureInventment(double monthly, double rate, int years) {
		
		double investment = 0;
		//This calculation is wrong, just for completing programme
		investment = (monthly * rate) * ((double) years * YEAR);
		
		return investment;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to the Investment Calculator");
		System.out.println();
		
		try (Scanner sc = new Scanner(System.in)) {
			String choice = "Y";
			
			while(choice.equalsIgnoreCase("Y")) {
				
				System.out.println("Enter monthly investment(P): ");
				double monthlyInvestment = sc.nextDouble();
				
				System.out.println("Enter investment rate: ");
				double interestRate = sc.nextDouble();
				
				System.out.println("Enter investment years: ");
				int inventmentYears = sc.nextInt();
				
				double investmentAmount = calculateFutureInventment(monthlyInvestment, interestRate, inventmentYears);
				NumberFormat currency = NumberFormat.getCurrencyInstance();
				
				System.out.println("Your future investment will be: "+currency.format(investmentAmount)+" pula");
				
				System.out.println("Do you want to continue?? (Y/N)");
				choice = sc.next();
			}
			
			System.out.println("Good luck on your investments\nAnd thank you for using our app");
		}
		
	}
	

}
