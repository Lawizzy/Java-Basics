package array;

public class ArrayClass {

	public static void main(String[] args) {


		String [] StringArray; //Only declaration
		String [] Array2 = {"blah", "blah2", "blah"}; //Declaration and initialization
		String [] Array4 = new String [12]; //Declaration and size
		System.out.println("Length of Array is "+Array2.length); //Length of the array
		System.out.println(Array2[0]); //Particular element
		
		int [] Array3 = {1,5,8, 8, 0, 3, 8, 9};
		System.out.println("Length of Array is "+Array3.length);
		System.out.println(Array3[5]);
		
		for(int i = 0; i < Array2.length; i++) {
			
			System.out.println("Element at index "+ i + " = "+Array2[i]);
		}
	}
	
	

}
