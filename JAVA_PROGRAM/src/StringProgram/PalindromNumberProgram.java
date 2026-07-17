package StringProgram;

import java.util.Scanner;

public class PalindromNumberProgram {

	public static void main(String[] args) {
		
		/*
		 * when the number remains the same after reversing it.
		 * 
		 * Example
			121 → Palindrome ✅
			1331 → Palindrome ✅
			123 → Not Palindrome ❌
		 */
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number to check Palindrome : ");
	int no=s.nextInt();
	int temp=no;
	int rev=0,rem;
	
	while (temp!=0) {
		
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	
	if (no==rev) {
		
		System.out.println(no+ "   is Palindrome number");
		
	} else {

		System.out.println(no+ "    is not Palindrome number");
	}
	
	s.close();

	}

}
