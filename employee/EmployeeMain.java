package employee;

public class EmployeeMain {

	public static void main(String[] args) {


		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		employee1.employeeId = 1234;
		employee1.name = "Luxor";
		employee1.employeeSalary = 50000.00;
		
		employee2.employeeId = 4321;
		employee2.name = "Luther";
		employee2.employeeSalary = 90000.00;
		
	
		employee1.bonusCalculation();
		employee2.bonusCalculation();


	}

}
