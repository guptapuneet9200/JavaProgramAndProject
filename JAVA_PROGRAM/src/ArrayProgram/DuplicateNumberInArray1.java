package ArrayProgram;

public class DuplicateNumberInArray1 {

	public static void main(String[] args) {
		
		// THIS IS CALLED BRUTE FORCE METHOD
//		REMEMBER THIS METHOS IS USE ONLY WHEN SAME NO. REPEAT 1 TIME ONLY
		
		int[] a= {3,5,7,9,6,4,3,8,4,5,7};
		
	//	String [] a= {"a","b","c","d","e","f","a","c"};     
		
		int n=a.length;
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j] && i!=j) {
					
					System.out.println("Duplicate number in array is "+a[i]);
				}
			}
			
		}
		
		
	}

}
