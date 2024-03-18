package employee;

public class Employee {

	String name;
	int employeeId;
	double employeeSalary;
	
	public void bonusCalculation() {
		
		double bonus = employeeSalary/100 * 20; 
		
		
		System.out.println("Employee "+ name+ " of ID "+employeeId+" your bonus is "+ bonus+ " from salary " + employeeSalary);
	}
}
