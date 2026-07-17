package StringProgram;

public class ReverseSamePlaceWord {

	public static void main(String[] args) {
		
	
		        String input = "Hello my name is world";
		        String[] words = input.split(" ");
		        String rev = "";

		        for (int i = 0; i < words.length; i++) {
		            String word = words[i];
		            String revWord = "";

		            // Reverse each word manually
		            for (int j = word.length() - 1; j >= 0; j--) {
		                revWord =revWord+ word.charAt(j);
		            											}
		            //For first letter of each should be caps
//		            revWord=Character.toUpperCase(revWord.charAt(0))+revWord.substring(1);
		            rev = rev+revWord;

		            if (i != words.length - 1) {
		                rev =rev+ " ";				//space between each word
		            							}
		        										}

		        
		        System.out.println(rev);
		    }
		
	}


