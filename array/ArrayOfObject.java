package array;

public class ArrayOfObject {

	public static void main(String[] args) {


		Object [] Array1 = {"Blah", 'L', 442, 5.9, "blah2"};
		
		Object [] [] Array2 = {
				
				{"blah", "blah2", 578, "blah3"},
				{12,77,"Said what", 72,950, true},
				{'K', 'g', 'n', "Who"}
		};
		
		for (int i = 0; i < Array1.length; i++) {
			
			System.out.println("Index: "+ i +" is "+ Array1[i]);
		}
		
		System.out.println("----------------------------------");
		
		for (Object [] x : Array2) {
			
			for (Object y: x) {
				System.out.print(y + ",");
			}
			
			System.out.print("\n");
		}
	}

}
