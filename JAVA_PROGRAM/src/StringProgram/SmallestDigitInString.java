package StringProgram;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.TreeSet;

import java.util.*;
public class SmallestDigitInString {

	public static void main(String[] args) {

		//Method =>1  By Using Tree Set

		String str = "claude2403edualc";

		/*		
		TreeSet<Integer> set = new TreeSet<Integer>();

		for(char ch : str.toCharArray()) {

			if(Character.isDigit(ch)) {
				set.add(ch - '0');      // Convert char to int
									}
										}
		if(set.size()<2) {

			 System.out.println("No second smallest digit found");

		}
		else {
			set.pollFirst();
			System.out.println("Second smallest digit is :"+set.getFirst());
		}

		 */		

		// Method 2 => By Using ArrayList

		ArrayList<Integer> list = new ArrayList<Integer>();

		for(char ch : str.toCharArray()) {

			if(Character.isDigit(ch)) {
				list.add(ch - '0');
			}
		}

		Collections.sort(list);

		if(list.size()>=2) {
			System.out.println("Smallest digit is :"+list.get(1));
		}
		else {
			System.out.println("No digit is here");
		}




	}

}
