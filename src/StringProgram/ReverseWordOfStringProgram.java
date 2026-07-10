package StringProgram;

public class ReverseWordOfStringProgram {

	public static void main(String[] args) {
		
		String s = "Hello my name is world";
	
		String[] w = s.split(" ");
		String rev="";
		for (int i=w.length-1; i>=0 ; i--) {
			
			rev=rev+w[i];
			
			if (i!=0) {
				rev=rev+" ";
			}
		}
System.out.println(rev);
	}

}
