package array;

public class TwoDimensionalExercise {

	public static void main(String[] args) {

		//A 2D array with 10 elements, 2 to 6, the first row being 2 and the rest an addition of that
		
		/*
		 * Eg
		 * Array1 = {
		 * 				{2,4,6 ...20}, 
		 * 				{3,6,9 ...30}, 
		 * 				{4,8,12 ...40}, 
		 * 				{5,10,15 ...50}, 
		 * 				{6,12,18 ...60}, 	
		 * 		
		 * 			}
		 */
		
		int [][] Array1 = new int [5][10];
		
		//System.out.println(Array1.length);
		//System.out.println(Array1[0].length);
				
		for (int i = 2; i <= 6; i++) {
			
			for(int x = 1; x <= 10; x++) {
				
				Array1[i - 2][x - 1] = i * x;
				
			}
		}
		
		for(int [] arr: Array1) {
			for(int element: arr) {
				System.out.print(element + ", ");
			}
			
			System.out.print("\n");
		}
	}

}
