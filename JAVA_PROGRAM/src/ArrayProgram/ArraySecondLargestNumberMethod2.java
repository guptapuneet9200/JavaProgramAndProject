package ArrayProgram;

public class ArraySecondLargestNumberMethod2 {

	public static void main(String[] args) {
		
		// Short Method 1
int[] arr = {12,13,21,34,54,98};
		
		int temp;
		int n= arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
				if(arr[i]<arr[j]) {        //if(arr[i]>arr[j])  for print second smallest no.
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
									}
									}
			if(i==1) {              
			// if(i==k-1) Similarly, to find the kth largest/smallest number	
				break;
					}
							}

		System.out.println("Second largest number in array is "+arr[1]);

	}

}
