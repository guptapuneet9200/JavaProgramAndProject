package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class CountCharOccurence {

	public static void main(String[] args) {
		String str = "tHi$ iS A jAVa pROgramM fOr BeGinnERs iN te$TiNg";
		
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch:str.toCharArray()) {
			
            if (ch == ' ') {
            	
               continue;              //Ignore space
            }
            
            // ch=Character.toLowerCase(ch); //Ignore Upper case letter
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+1);
									}
			else {
				map.put(ch, 1);
				}
						}
	for(Map.Entry<Character, Integer> entry :map.entrySet()) {
		System.out.println(entry.getKey()+" : "+entry.getValue());
	}
		
	//	System.out.println(map);
	}

}
