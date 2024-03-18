package exercise1_ATM;

public class BankAccount {

	private long accountNumber;
	private String accountName;
	private double accountBalance;
	
	public double deposit(double depositAmount) {
		if(depositAmount > 0) {
			
			System.out.println("Deposited money "+ depositAmount);
			accountBalance += depositAmount;
		}else {
			
			System.out.println(depositAmount +" amount cant be deposited");
		}
		return accountBalance;
	}
	
	public double withdraw(double withdrawal) {
		
		if(withdrawal < 0) {
			
			System.out.println(withdrawal +" amount cant be withdrawn");

		}
		else if(withdrawal < accountBalance) {
			
			System.out.println("Withdrawal money "+ withdrawal);
			accountBalance -= withdrawal;
		}else {
			
			System.out.println(withdrawal + " amount is greater than what you currently have");

		}
		return accountBalance;

	}
	
	public void checkBalance() {
		
		System.out.println("Your current "+ accountName+ " balance is "+ accountBalance+ " from account number " + accountNumber);

	}

	public BankAccount(long accountNumber, String accountName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	
}
