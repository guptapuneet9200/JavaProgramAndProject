package StringProgram;
import java.util.HashMap;
import java.util.Map;
public class MaxRepeatedCharacter {

	public static void main(String[] args) {
	
		//This method is find first maximum repeated character in a string
		
		//        String s = "abbcccdddd"; o/p=> d
//      String s = "punitgupta";    o/p=> p here'u & t' are repeated but giving only 'p'
		        
		  String s = "this is a demo text to check maximum repeated character";
		  s=s.replaceAll("\\s","" );
		        Map<Character, Integer> hm = new HashMap<>();

		        // Count frequency of each character
		        			
		        
		        for (char c : s.toCharArray()) {
		        	Integer count =hm.get(c);
		        	if(count==null) {
		        		
		        		  hm.put(c, 1);
		        	}
		        	else {
		        		count=count+1;
		        		hm.put(c, count);
		        	}
		          
		        }

		        // Find the character with maximum frequency
		        char maxChar = ' ';
		        
		        int maxCount = 0;

		        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
		            if (entry.getValue() > maxCount) {
		                maxChar = entry.getKey();
		                maxCount = entry.getValue();
		            }
		        }

		        // Print the result
		        System.out.println("Maximum repeated character: " + maxChar);
		        System.out.println("Count: " + maxCount);
		    }
		


	}


