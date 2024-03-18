package array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {


		/*
		 * Array List
		 * Supports creation of dynamic arrays
		 * Supports different functions: for array manipulation
		 * Its size is not fixed
		 */
		
		ArrayList <String> Array1 = new ArrayList<String>(); //Can leave it blank, but can be changed later
		ArrayList <String> Array2 = new ArrayList<String>(100); //Can leave it declare size, but can be changed later
		//List <String> Array3 = new ArrayList<String>(); //Can also use the parent interface (List)
		
		Array1.add("Blah1");
		Array1.add("Blah2");
		Array1.add("Blah3");
		Array1.add("Blah4");
		Array1.add("Blah5");
		Array1.add("Blah6");
		Array1.add("Blah4");
		
		Array2.add("Black");
		Array2.add("Blue");
		Array2.add("Green");
		Array2.add("Purple");
		
		System.out.println(Array1);
		System.out.println(Array1.get(0));
		
		Array1.set(0, "New word");
		System.out.println(Array1.get(0));
		System.out.println(Array1);
		
		Array1.remove(2); //removes specific elements with index
		//Array1.remove("Blah4"); //removes specific elements with value
		System.out.println("Array1 elements: "+ Array1);
		System.out.println("Array1 subList: "+ Array1.subList(0, 3));
		System.out.println("Array1 elements (Blah4): "+ Array1.indexOf("Blah4"));
		System.out.println("Array1 elements (Last Blah4): "+ Array1.lastIndexOf("Blah4"));
		System.out.println("Array1 elements (has Blah4): "+ Array1.contains("Blah4"));
		System.out.println("Array1 size: "+ Array1.size());


		/*for (String x : Array1) {
			
			System.out.println(x);
		}*/ //Works sometimes
		
		System.out.println("Array2 elements: "+ Array2);
		Array2.clear(); //removes all elements
		System.out.println("Array2 isEmpty: "+ Array2.isEmpty());
		System.out.println("Array2 elements: "+ Array2);

		
		


		



	}

}
