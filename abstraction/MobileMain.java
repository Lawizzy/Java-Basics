package abstraction;

public class MobileMain {

	public static void main(String[] args) {

		//Mobile mobile = new Mobile(); //Throwns an error

		Mobile mobile;
		
		mobile = new Android();
		mobile.doubleTap();
		
		mobile = new IOS();
		mobile.doubleTap();
	}

}
