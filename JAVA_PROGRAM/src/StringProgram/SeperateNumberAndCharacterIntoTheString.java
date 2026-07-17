package StringProgram;

public class SeperateNumberAndCharacterIntoTheString {

	public static void main(String[] args) {
		
		String s ="kfh79fhkdh56677jfjdgf64646fhkhfk4646";
		String letter = "";
		String digit = "";
		
		for(int i=0;i<s.length();i++) {
			
			char ch =s.charAt(i);
			
			if(Character.isDigit(ch)) {
				
				digit+=ch;
				
			}
			else if (Character.isLetter(ch)) {
				
				letter+=ch;
			}
		}
		
		System.out.println("Letter into the string are =>" + letter);
		System.out.println("Digit into the string are =>" + digit);
		
// OR 	WE CAN PERFORM BY USING REPLACE ALL METHOD
//		System.out.println("Number are :"+s.replaceAll("\\D", ""));
//		System.out.println("Characters are :"+s.replaceAll("\\d",""));
// In this approach, \\D targets all non-digit characters, and \\d targets all digit
		

	}

}
