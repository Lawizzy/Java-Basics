package constructors;

public class ConstMain {

	public static void main(String[] args) {


		Constructor const1 = new Constructor(); //uses default or parameterless constructor
		Constructor const2 = new Constructor("Mina", "Nawe", 987654321, 72345670, 56, 9000);
		
		const1.firstName = "Luxor";
		const1.lastName = "Luther";
		const1.Id = 123456789;
		const1.age = -14;
		const1.phoneNumber = 76564534;
		const1.currentBalance = 300000.00;
		
		const1.stageCalculation();
		const2.stageCalculation();
		
		
		

	}

}
