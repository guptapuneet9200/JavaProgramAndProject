package MiscelleneousProgram;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int factorial=1;
				
		while (num>0) {
			factorial=factorial*num;
			num--;
		}
				System.out.println("factorial of a number is :"+factorial);
				sc.close();
	}

}
