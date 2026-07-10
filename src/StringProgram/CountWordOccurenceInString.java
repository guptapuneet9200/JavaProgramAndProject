package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurenceInString {

	public static void main(String[] args) {
		
		String str = "my name is claude claude";
		String[] words = str.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(String word :words) {
			if(map.containsKey(word)) {
				
				map.put(word, map.get(word)+1);
										}
			else {
				map.put(word, 1);
				}
								}
	//	System.out.println(map);
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(key+ " : "+val);
			
		}

	}

}
