package com.program_pratise.Demo;

abstract class Vehicle {
	
	abstract void start();

}

class Car extends Vehicle{
	 
	void start() {
		System.out.println("Car is start");
	}
}

class Scooter extends Vehicle{
	
	void start() {
		System.out.println("Scooter is start");
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		
		Scooter s = new Scooter();
		s.start();
	}
}
