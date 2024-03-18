package choresTest;

public class MainMethod {

	public static void main(String[] args) {


		Person larry = new Person("Larry", 13);
		//larry.name = "Larry"; if having a default constructor
		
		Person moe = new Person("Moe", 15);
		//moe.name = "Moe";
		
		Person curly = new Person("Curly", 20);
		//curly.name = "Curly";
		
		Car ferrari = new Car();
		ferrari.name = "Ferrari S7";
		
		larry.washTheCar(ferrari);
		moe.takeOutTheTrash();
		boolean crabgrass = curly.mowTheLawn();
		System.out.println("Crabgrass status: "+crabgrass);
		
	}

}
