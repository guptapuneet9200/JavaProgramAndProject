package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>(Arrays.asList("Apple","Banana","Kiwi"));
		Set<String> set2 = new HashSet<String>(Arrays.asList("Apple","Banana","Grapes"));
		
		Set<String> union = new HashSet<String>(set1);
		union.addAll(set2);
		System.out.println("Union is : "+union);
		

	}

}
