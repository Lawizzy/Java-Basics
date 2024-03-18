package accessModifiyers;

public class TheMain {

	public static void main(String[] args) {

		AccessModifier m1 = new AccessModifier();
		
		m1.publicMethod();
		m1.protectedMethod();
		m1.defaultMethod();
		//m1.privateMethod(); The method privateMethod() from the type AccessModifier is not visible
	}

}
