package com.program_pratise.Demo;

import java.io.FileInputStream;


public class ExceptionExample {

	public static void main(String[] args) {
	
		try {
			FileInputStream fis = new FileInputStream("d:/abc.txt");
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
		

	}

}
