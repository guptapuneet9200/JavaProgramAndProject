package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class TestingCode {

	public static void main(String[] args) {
		String s = "this is a demo text to check maximum repeated character" ;
		 
		 s=s.replaceAll("\\s", "");
		 
		 Map<Character, Integer> map = new HashMap<Character, Integer>();
		 
		 for(char c : s.toCharArray()) {
			 
			 if(map.containsKey(c)) {
				 
				 map.put(c, map.get(c)+1);
			 }
			 else {
				 map.put(c, 1);
			 }
			 
		 						}
		 
		 char maxCar = ' ';
		 int maxCount = 0;
		 
		 
		 for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			 
			if(entry.getValue()>maxCount) {
				
				maxCar = entry.getKey();
				maxCount = entry.getValue();
				
			}
		 		}
		 
		 System.out.println("Max repeated char is " +maxCar);
		 System.out.println("Max repeated count is " +maxCount);

	}

}
