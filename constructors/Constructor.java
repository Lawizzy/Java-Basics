package constructors;

public class Constructor {
	
	/*
	 * Constructor: 
	 * A block of code similar to a method that gets executed when an instance of a class is created (object)
	 * Generally used to instantiate member variables
	 * Uses the same name as its class
	 * Doesn't have return type
	 * Executed automatically, not/can't be called
	 * Supports method overloading (constructor overloading)
	 */

	String firstName, lastName;
	int Id, phoneNumber, age;
	double currentBalance;
	
	public void stageCalculation() {
		
		if(age >= 0 && age <= 12) {
			
			System.out.println(firstName +" " + lastName+ " You are a kid");
		}else if(age > 12 && age <= 19) {
			
			System.out.println(firstName +" " + lastName+ " You are a teenager");
		}else if(age > 19 && age <= 35) {
			
			System.out.println(firstName +" " + lastName+ " You are a banana");
		}else if(age > 35 && age <= 45) {
			
			System.out.println(firstName +" " + lastName+ " You are a Adult");
		}else if(age > 45) {
			
			System.out.println(firstName +" " + lastName+ " You are Old and hopefully wise");
		}else {
			
			System.out.println(firstName +" " + lastName+ " You are not human");
		}
		
	}
	
	//If this one is deleted, automatically the default constructor becomes the following one
	public Constructor() {
		
		System.out.println("Empty Constructor here");
	}

	
	//this refers to the member variable
	public Constructor(String firstName, String lastName, int id, int phoneNumber, int age, double currentBalance) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Id = id;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.currentBalance = currentBalance;
	}
	
	
	
}
