package dailyCodingProblems;

public class ArrayChallenge {
		
	public void stockCalculator(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			int profit = arr[i] * 2;
						
			System.out.println("For "+arr[i]+" dollar stock you'll sell them for: "+profit);
		}
		
//		for(int num : arr) {
//			
//			int profit = num * 2;
//			
//			System.out.println("For "+num+" dollar stock you'll sell them for: "+profit);
//		}
	}

	public static void main(String[] args) {


		int[] stocks = {9, 11, 8, 7, 5, 10, 12};
		
		ArrayChallenge instance = new ArrayChallenge();
		
		instance.stockCalculator(stocks);
	}

}
