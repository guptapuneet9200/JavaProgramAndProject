package ArrayProgram;

public class ArraySecondLargestNumberMethod3 {

	public static void main(String[] args) {
		
		int[] a={10,98,87,78,32,97,100};
		
		// Short Method 2
		int largest=Integer.MIN_VALUE;     
	//	int largest=Integer.Max_VALUE;  Use when find second lowest no.
		int Second_largest=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>largest) {   
		// if(a[i]<largest) Use when find second lowest no.
				Second_largest=largest;
				largest=a[i];
							}
			else if (a[i]>Second_largest && a[i]!=largest) {
		//  else if (a[i]<Second_largest && a[i]!=largest) {
				Second_largest=a[i];
			}
		}
		
		if (Second_largest==Integer.MIN_VALUE) {
//		if (Second_largest==Integer.MAX_VALUE) {			
			System.out.println("There is no second largest no. in the list");
		}
		else {
			System.out.println(" Second largest number is "+Second_largest);
		}
			

}
}