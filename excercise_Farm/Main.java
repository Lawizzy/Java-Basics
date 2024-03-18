package excercise_Farm;

public class Main {

	public static void main(String[] args) {


		Cow cow = new Cow();
		Horse horse = new Horse();
		
		cow.setName("Elies");
		horse.setName("Mr. Ed");
		
		cow.makeSound();
		horse.makeSound();
	}

}
