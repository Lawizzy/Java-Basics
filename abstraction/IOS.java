package abstraction;

public class IOS extends Mobile{
	
	/*
	 * All classes that extend an Abstract class they are forced to implement all its abstract methods
	 * 
	 */

	@Override
	public void doubleTap() {
		
		System.out.println("IOS double tap");
	}

}
