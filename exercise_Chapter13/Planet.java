package exercise_Chapter13;

public class Planet {
	
	public String planetName;

	public Planet(String planetName) {
		super();
		this.planetName = planetName;
	}

	@Override
	public String toString() {
		return "Planet [planetName: " + planetName + "]";
	}

}
