package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		/*
		 * 2D-Array
		 * An array within an array/Arrays within an array
		 */
		
		String [][] Array1 = {{}, {}, {}}; //Eg
		
		String [][] Array2 = {{"blah1", "blah2", "blah3"}, {"Mooo1", "Mooo2"}};
		
		System.out.println(Array2.length); //Number of rows (Outer row)
		System.out.println(Array2[0].length); //First row (Inner row)
		System.out.println(Array2[0][2]); //Specific element (Row by Column)
		Array2[0][2] = "Whaaaat"; //Updating or Adding
		System.out.println(Array2[0][2]);
		
		System.out.println("-------------------");

		
		//Iterating through each inner row
		for(String [] x : Array2) {
			
			for (String y : x) {
				
				System.out.println(y);
			}
			
			System.out.println("-------------------");
		}
	}

}
