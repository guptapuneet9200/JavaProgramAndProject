package com.program_pratise.Demo;

class MetacubeTest1 {

	void Test() {
		System.out.println("A");
	}

}

class childe extends MetacubeTest1{
	
	@Override
	
	void Test() {
		System.out.println("B");
		
	}


//public class Main{
	
	public  static void main(String[] args) {
		
		childe p1=new childe();
		p1.Test();
		
	}
}
