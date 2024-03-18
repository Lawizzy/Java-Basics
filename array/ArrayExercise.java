package array;

public class ArrayExercise {

	public static void main(String[] args) {


		//Reversing the content of an array
		
		String [] Array1 = {"Blah","Blah2","Blah3","Blah4","Blah5","Blah6","Blah7"};
		
		//My solution
		for (int i = 0; i <= Array1.length; i++) {
			
			int temp = i;
			if(temp == Array1.length - 1) {
				//System.out.println(Array1[temp]);
				for(int x = temp; x >= 0; x--) {
					System.out.println(Array1[x]);
				}
			}
		}
		
		//Their solution
		
		//Can search, as many
	}
	
	
	

}
