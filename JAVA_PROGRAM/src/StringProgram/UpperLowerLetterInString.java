package StringProgram;



public class UpperLowerLetterInString {

	public static void main(String[] args) {
		
		String s= "The IndiA Is A greAt CouNtrY IN The WoRld";
		
		String upperCaseLetter="";
		String lowerCaseLetter="";
		
		int upperCount=0;
		int lowerCount=0;
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upperCaseLetter= upperCaseLetter+ch;
				upperCount++;
			}
			
			else if(Character.isLowerCase(ch)){
				lowerCaseLetter=lowerCaseLetter+ch;
				lowerCount++;
			}
		}
		
		System.out.println("Upper case letter's are :"+upperCaseLetter);
		System.out.println("Lower case letter's are :"+lowerCaseLetter);
		System.out.println("Total Upper letter are :"+upperCount);
		System.out.println("Total Lower letter are :"+lowerCount);
	}

}
