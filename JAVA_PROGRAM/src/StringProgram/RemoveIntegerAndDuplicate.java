package StringProgram;

import java.util.HashSet;

import java.util.Set;

public class RemoveIntegerAndDuplicate {

	public static void main(String[] args) {
		
		 String s = "01m34y n42a1m5e i33s3 7w8h89a99t10e133ve0r6w2h3a4t5555e6ve8888888888r0000000000";
		 
		 String s1=s.replaceAll("[0-9]", " ");
		 
		 Set<Character> set = new HashSet<Character>();
		 
		 for (char ch : s1.toCharArray()) {
			set.add(ch);
		}
		 System.out.println("Answer is :");
		 for(char ch:set) {
			 
			System.out.print(ch);
		 }
	}

}
