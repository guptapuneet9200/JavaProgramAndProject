package ArrayProgram;

import java.util.ArrayList;

public class FindEvenAndOddNumberInArray {

	public static void main(String[] args) {
		
		int[] a = {10,20,87,95,36,8,9,1,3,6,41,11,19,91};
		
		ArrayList<Integer> al1= new ArrayList<>();
		ArrayList<Integer> al2= new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				al1.add(a[i]);
			}
			
			else 
			{
				al2.add(a[i]);
			}
		}
		
		int total1=0;
		for(int n:al1) {
			total1=total1+n;
			System.out.println("Even numbers are =>"+n);
			
		}
		System.out.println("Total even numbers are =>"+al1.size());
		System.out.println("Sum of even numbers are =>"+total1);
		
		System.out.println("====================================================");
		
		int total2=0;
		for(int n:al2) 
		{
			total2=total2+n;
			System.out.println("Odd numbers are =>"+n);
			
		}
		System.out.println("Total odd numbers are =>"+al2.size());
		System.out.println("Sum of odd numbers are =>"+total2);
	}

}
