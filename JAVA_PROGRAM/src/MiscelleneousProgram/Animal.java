package MiscelleneousProgram;

public class Animal {
	
	
	public void eat() {
		System.out.println("I am Eating");
	}
	
	public void run() {
		System.out.println("I am Running");
	}
	
		

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.eat();
		a.run();
	//	Birds b = new Birds();
		Birds.fly();      //static method can call by class name (also can be call by refrence but its not a good practise)
		

	}

}
