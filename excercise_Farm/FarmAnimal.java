package excercise_Farm;

public class FarmAnimal {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void makeSound() {
		
		System.out.println(this.getName() + "makes a sound...");
	}

}
