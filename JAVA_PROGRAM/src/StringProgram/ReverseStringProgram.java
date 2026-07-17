package StringProgram;

public class ReverseStringProgram {

	public static void main(String[] args) {
		
		String s= "Deepak is a nice boy in a school";
		String rev= "";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
			
		}
	
System.out.println(rev);
	}

}
