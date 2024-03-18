package inheritance;

public class PolygonMain {

	public static void main(String[] args) {


		Triangle tr = new Triangle();
		tr.setBaseAndHeight(45.0, 32.5);
		tr.area();
		
		Rectangle rc = new Rectangle();
		rc.setBaseAndHeight(57.0, 62.8);
		rc.area();
	}

}
