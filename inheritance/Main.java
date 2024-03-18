package inheritance;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Child inherits everything from the parent eg class2 from class1
		 * Relationship, is a eg class2 is class1 but reverse is not true
		 */
		
		Class2 c2 = new Class2();
		
		c2.num1 = 100;
		c2.num2 = 50;
		
		c2.addtition();
		c2.subtraction();
	}

}
