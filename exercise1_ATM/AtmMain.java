package exercise1_ATM;

public class AtmMain {

	public static void main(String[] args) {


		BankAccount acc1 = new BankAccount(1234566, "Savings", 200000.00);
		
		acc1.withdraw(300.00);
		acc1.checkBalance();
		acc1.deposit(2.00);
		acc1.checkBalance();
	}

}
