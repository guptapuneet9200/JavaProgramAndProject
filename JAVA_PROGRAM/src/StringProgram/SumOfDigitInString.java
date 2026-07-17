package StringProgram;

public class SumOfDigitInString {

	public static void main(String[] args) {
		
		String s= "jdju790df888f8ff979f";
		
		int sum=0;
		
		for (int i = 0; i < s.length()-1; i++) {
			
			char ch=s.charAt(i);
			
			if(Character.isDigit(ch)) {
				
				sum=sum+(ch-'0');
									}
			
											}
		
		System.out.println("The Sum of Digit is :"+sum);

	}

}
