package ArrayProgram;

public class FindFirstDuplicateNumberInArray {

	public static void main(String[] args) {
		int[] a= {6,5,3,2,5,1,2,4,5};
		
		for (int i = 0; i < a.length; i++) {
			
			int temp=0;
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					
					System.out.println("First duplicate number is "+a[i]);
					temp++;
					break;
				}
			}
			if(temp>0) {
				break;
			}
		}

	}

}
