package StringProgram;

public class SumOfDigitInStringSecondType {

	public static void main(String[] args) {
		
		String s= "jdju790df888f8ff979f";
		
		int sum=0;
		
		for(char ch :s.toCharArray()) {
			
			if(Character.isDigit(ch)) {
				sum=sum+Character.getNumericValue(ch);
				
			}
		}
		
		System.out.println("Sum to Number in a string is :"+sum);
	}

}
