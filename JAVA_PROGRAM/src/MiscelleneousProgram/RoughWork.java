package MiscelleneousProgram;

import java.util.Arrays;

public class RoughWork {

	public static void main(String[] args) {
		
		int[] arr = {2,0,4,0,3,0,5,0,8,9,3,1};
		
		int left=0;
		int right=arr.length-1;
		
		while (left<right) {
			if(arr[left]%2==0) {
				left++;
								}
			else if (arr[right]%2!=0) {
				right--;
									}
			else {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				}
							}
	System.out.println(Arrays.toString(arr));
	}
}
