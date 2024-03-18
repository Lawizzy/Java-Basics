package accessModifiyers;

public class AccessModifier {
	
	/*
	 * public: can be accessed anywhere
	 * private: accessed only in the class its declared in
	 * protected: accessed within the same package and outside a package if inherited
	 * default is similar to protected(if left unspecified) but can't be accessed outside a package even if inherited
	 */
	
	public void publicMethod() {
		
		System.out.println("Im a public method");
	}
	
	@SuppressWarnings("unused")
	private void privateMethod() {
		
		System.out.println("Im a private method");
	}
	
	void defaultMethod() {
		
		System.out.println("Im a default method");
	}
	
	protected void protectedMethod() {
		
		System.out.println("Im a protected method");
	}

}
