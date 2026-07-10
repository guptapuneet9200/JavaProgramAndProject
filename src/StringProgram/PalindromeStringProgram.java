package StringProgram;



public class PalindromeStringProgram {



	public static void main(String[] args) 
	{

		String str= "madam";
		String reverse = "";

		// Reverse the string
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		// Compare original and reversed string
		if (str.equals(reverse)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is NOT Palindrome");
		}



	}


}


