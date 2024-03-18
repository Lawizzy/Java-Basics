package abstraction;

/*
 * Abstraction:
 * Hiding the implementation details from the user and provide only the functionality
 * Sort of showing the user buttons instead of showing them the inner workings of a device
 * Abstract classes cannot be instantiated but can be inherited
 * Abstract method have no implementation, just a structure or layout
 * Abstraction can be in two ways being through abstract classes and methods or through interfaces
 * Only if Abstract method, then their children are forced to inherit them
 */

public abstract class Mobile {
	
	public abstract void doubleTap();
	
	public void blah() {
		System.out.println("Blah");
	}

}
