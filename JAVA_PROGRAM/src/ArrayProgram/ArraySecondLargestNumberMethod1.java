package ArrayProgram;

public class ArraySecondLargestNumberMethod1 {

	public static void main(String[] args) {
		
		// Long Method For Sorting The Array
		
		int[] arr = {12,13,21,34,54,98,97};
		
		int temp;
		int n= arr.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) 
			{
				
				if(arr[i]<arr[j]) {		// For second smaller no. 'arr[i]>arr[j]'
					temp=arr[i];	//Here we arrange the array in Descending order
					arr[i]=arr[j];
					arr[j]=temp;
									}
			}
		}

		System.out.println("Second largest number in array is "+arr[1]);
		// Similarly arr[2] for 3rd highest number and so on
	}

}
