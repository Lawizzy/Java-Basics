package choresTest;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void takeOutTheTrash() {
		System.out.println("Gabbages thrown by "+this.getName());
	}
	
	public boolean mowTheLawn() {
		
		boolean isfound = false;
		
		if(isfound) {
			
			System.out.println("The grass was mowed by " +this.getName()+" but crabgrass was found");

			isfound = true;
		}
		
		System.out.println("The grass was mowed by " +this.getName()+" but crabgrass was not found");

		return isfound;
	}
	
	public void washTheCar(Car car) {
		
		System.out.println("The "+car.name +" was washed by "+this.name);
	}

}
