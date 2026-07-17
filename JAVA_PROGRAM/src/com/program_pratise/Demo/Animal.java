package com.program_pratise.Demo;

class Animal {

	public void Eat() {
		System.out.println("I'm Eating");
	}
	
	public void Run() {
		System.out.println("I'm Running");
	}
	
	public static void main(String[] args) {
		Animal a=new Animal();
		a.Eat();
		a.Run();
		Birds b=new Birds();
		b.Fly();
	}
}

class Birds{
	
	void Fly() {
		System.out.println("I'm Flying");
	}
}

