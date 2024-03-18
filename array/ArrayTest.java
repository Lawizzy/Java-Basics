package array;

public class ArrayTest {

	public static void main(String[] args) {


		double[] squareRoot = new double[11];
		
		for(int n = 1; n <=10; n++) {
			
			squareRoot[n] = Math.sqrt(n);
			
			System.out.println("The square root of "+ n +" is "+squareRoot[n]);
		}
		
	}

}
