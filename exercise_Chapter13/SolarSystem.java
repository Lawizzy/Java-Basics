package exercise_Chapter13;

public enum SolarSystem {
	
	Mecu("Mecury"),
	Ven("Venus"),
	Ear("Earth"),
	Mar("Mars"),
	Jup("Jupiter"),
	Sat("Saturn"),
	Uri("Urenus"),
	Nep("Neptune"),
	Plu("Pluto");
	
	private final Object value;

	private SolarSystem(Object value) {
		
		this.value = value;
	}
	
	public Object value() {
		
		return value;
	}
	
	

}
