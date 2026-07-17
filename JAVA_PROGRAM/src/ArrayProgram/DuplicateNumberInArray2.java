package ArrayProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInArray2 {

	public static void main(String[] args) {
		
		//SET Interface Method
//		REMEMBER THIS METHOd USE WHEN ONLY ONE TIME ELEMENT IS REPEATED 
		
		int[] a= {10,30,85,65,25,89,25,30,85};
		
		Set<Integer>s= new HashSet<Integer>();
		for(int no:a) {
			
			if (s.add(no)==false){    // "s.add(no)" this will return boolean value
				System.out.println("Duplicate number in array is "+no);
				
			}
		}
				
		
	}

}
