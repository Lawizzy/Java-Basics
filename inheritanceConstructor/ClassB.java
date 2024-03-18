package inheritanceConstructor;

public class ClassB extends ClassA{

	int c;
	/*
	 * A must to have the constructor here and optional to expand it here after
	 * Unless the parent class also has a no args constructor
	 */
	
	public ClassB(int a, int b, int c) {
		super(a, b);
		// TODO Auto-generated constructor stub
		
		this.c = c;
	}

}
