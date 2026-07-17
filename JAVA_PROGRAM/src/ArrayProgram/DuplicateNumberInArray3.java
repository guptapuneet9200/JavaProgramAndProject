package ArrayProgram;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateNumberInArray3 {

	public static void main(String[] args) {
		
// This method is use when same number is repeated multiple times.		
		int[] a= {10,20,30,80,70,60,40,30,10,20,89,80,10,20,10,30,80};
		
		Map<Integer, Integer> hm = new HashMap<>();
		for (int no : a) {
			
			Integer count=hm.get(no);
			if(count==null) {
				hm.put(no, 1);
							}
			else {
				
				hm.put(no, count+1);
				}
			
						}
		
		Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
		for(Map.Entry<Integer, Integer> me :es) {
			if(me.getValue()>1) {
				System.out.println("Duplicate number of array is "+me.getKey());
								}
												}
		}

}
