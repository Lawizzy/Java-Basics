package exercise_Chapter13;

import java.util.ArrayList;

public class SentenceDisector {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("No sentence provided");
		}
		else {
			
			ArrayList<String> word = new ArrayList<>();
			String longestWord = null;
			String shortestWord = null;
			
			//StringBuilder newWord = new StringBuilder();
			
			for(int i = 0; i < args.length; i++) {			
				
				if(longestWord == null || shortestWord == null) {
					
					longestWord = args[i];
					shortestWord = args[i];
				}
				else {
					if(args[i].length() > longestWord.length()) {
						longestWord = args[i];
					}
					if(args[i].length() < shortestWord.length()) {
						shortestWord = args[i];
					}
				}
				word.add(args[i]);
				
//				String delimiter = "\t";
//				newWord.append(word.get(i));
//				if(i < word.size() - 1) {
//					
//					newWord.append(delimiter);
//				}
				
			
			}
			System.out.println("Your sentence is: "+word+" and has "+args.length+" words");
			System.out.println("Your longest word is: "+longestWord+" with "+longestWord.length()+" letters");
			System.out.println("Your shortest word is: "+shortestWord+" with "+shortestWord.length()+" letters");



		}
	}

}
