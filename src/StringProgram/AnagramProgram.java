package StringProgram;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		
	String s1= "silet";
	String s2= "listen";
	
	/*When String Are Anagram-
	 * 1) Both strings contain the same characters
	 * 2)Characters appear the same number of times
	 * 3) Order can be different
	 * 
	 * Example 1) "listen" and "silent" → Anagram ✅
	 * Example 2) "hello" and "world" → Not Anagram ❌
	 */
	
	
	if (s1.length()!=s2.length()) {
		System.out.println("No Anagram");
		return;
	}
	
	char[] arr1 =s1.toCharArray();
	char[] arr2 =s2.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	if (Arrays.equals(arr1, arr2)) {
		
		System.out.println("Anagram");
	}else {
		System.out.println("No Anagram");
	}
	
	}
	
	
}
