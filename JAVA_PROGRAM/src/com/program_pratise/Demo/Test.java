package com.program_pratise.Demo;

public class Test {

	public static void main(String[] args) {
		int[] a = {10,20,87,95,36,8,9,1,3,6,41,11,19,91};
		
		for (int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				System.out.println("Even no is "+a[i]);
			}
			
			else {
				System.out.println("Odd no is "+a[i]);
			}
		}

	}

}
