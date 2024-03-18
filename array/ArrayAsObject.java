package array;

public class ArrayAsObject {

	public static void main(String[] args) {


		int [] Array1 = new int [14];
		
		Array1[3] = 78; //Adding
		
		for(int i = 0; i < Array1.length; i++) {
			
			System.out.println("Element at index "+ i + " = "+Array1[i]);
		}
	}

}
